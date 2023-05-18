package ch4.task11;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HelloWorld {
    public static void main(String[] args) {
        Class<?> systemClass = System.class;
        Field outField;
        try {
            outField = systemClass.getField("out");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        Object outObject;
        try{
            outObject = outField.get(null); // static
        } catch(IllegalAccessException e){
            throw new RuntimeException(e);
        }

        Method printlnMethod;
        try {
            printlnMethod = outObject.getClass().getMethod("println", String.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        try {
            printlnMethod.invoke(outObject, "Hello World!");
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
