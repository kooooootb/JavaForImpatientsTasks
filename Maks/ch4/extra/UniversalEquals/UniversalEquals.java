package ch4.extra.UniversalEquals;

import java.lang.reflect.Field;
import java.lang.reflect.InaccessibleObjectException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UniversalEquals {
    static public boolean equals(Object obj1, Object obj2){
        List<Object[]> list = new ArrayList<>();
        return checkEquality(obj1, obj2, list);
    }
    static private boolean isPairIn(Object obj1, Object obj2, List<Object[]> list){
        for(Object[] objs : list){
            if(objs[0] == obj1 && objs[1] == obj2){
                return true;
            }
        }

        return false;
    }
    static private boolean checkEquality(Object obj1, Object obj2, List<Object[]> list){
        // base case 1
        if(obj1 == obj2){
            return true;
        }

        // base case 2
        if(obj1 == null || obj2 == null){
            return false;
        }

        Class<?> clazz = obj1.getClass();

        // base case 3
        if(clazz != obj2.getClass()){
            return false;
        }

        // check for recursion, checking pairs
        if(isPairIn(obj1, obj2, list)){
            return true;
        } else{
            list.add(new Object[]{obj1, obj2});
        }

        // check if objects override equals
        Optional<Method> methodOpt = Arrays.stream(clazz.getDeclaredMethods()).filter(method -> method.getName().equals("equals")).findFirst();
        if(methodOpt.isPresent()){
            Method method = methodOpt.get();
            try {
                return (Boolean) method.invoke(obj1, obj2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }

        // call for fields pairs
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            try {
                field.setAccessible(true);
                Object field1 = field.get(obj1);
                Object field2 = field.get(obj2);

                if(!checkEquality(field1, field2, list)){
                    return false;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch(InaccessibleObjectException ignored){
                continue; // if we cant access fields
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str1 = "asd";
        String str2 = "asd";
        System.out.println(equals(str1, str2));
    }
}
