package ch4.task9;

import java.lang.reflect.Field;

public class UniversalToString {
    public static String toString(Object object){
        if(object == null){
            return "";
        }

        Class<?> classObject = object.getClass();
        Field[] fields = classObject.getDeclaredFields();
        StringBuilder result = new StringBuilder(classObject.getSimpleName());
        result.append(": ");

        for(Field field : fields){
            result.append(field.getName());
//            result.append(" = ");
//            Object fieldObject;
//
//            try {
//                field.setAccessible(true);
//                fieldObject = field.get(object);
//            } catch (IllegalAccessException e) {
//                throw new RuntimeException(e);
//            }
//
//            if(fieldObject.getClass().isPrimitive()){
//                result.append(fieldObject);
//            } else{
//                result.append(toString(fieldObject));
//            }

            result.append(", ");
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Player player = new Player("Name", 10, 20);
        System.out.println(toString(player));
    }
}
