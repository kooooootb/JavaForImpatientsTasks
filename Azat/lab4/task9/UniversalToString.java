package ch4.task9;

import java.lang.reflect.Field;
import java.lang.reflect.InaccessibleObjectException;

public class UniversalToString {
    public static String toString(Object object){
        if(object == null){
            return "";
        }

        Class<?> classObject = object.getClass();
        Field[] fields = classObject.getDeclaredFields();

        StringBuilder result = new StringBuilder("[");
        result.append(classObject.getSimpleName());
        result.append(": ");

        for(Field field : fields){
            result.append(field.getName());
            Object fieldObject;

            try {
                field.setAccessible(true);
                fieldObject = field.get(object);

                result.append(" = ");
                if(field.getType().isPrimitive()){
                    result.append(fieldObject);
                } else{
                    result.append(toString(fieldObject));
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch(InaccessibleObjectException ignored){
            } finally {
                if(field != fields[fields.length-1]) {
                    result.append(", ");
                }
            }
        }

        result.append("]");
        return result.toString();
    }
    public static void main(String[] args) {
        Player player = new Player("Name", 10, 20);
        System.out.println(toString(player));
    }
}
