package ch4.task13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.DoubleFunction;

public class AllValues {
    static void printValues(Method method, double low, double high, double step){
        for(double current = low;current < high;current += step){
            try {
                System.out.println(method.invoke(null, current));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }
    static void printValues1(DoubleFunction<Object> function, double low, double high, double step){
        for(double current = low;current < high;current += step){
            System.out.println(function.apply(current));
        }
    }
    public static void main(String[] args) {
        Method sqrtMethod, toHexMethod;
        try{
             sqrtMethod = Math.class.getMethod("sqrt", double.class);
        } catch(NoSuchMethodException e){
            throw new RuntimeException(e);
        }

        try{
            toHexMethod = Double.class.getMethod("toHexString", double.class);
        } catch(NoSuchMethodException e){
            throw new RuntimeException(e);
        }

        System.out.println(sqrtMethod.getName() + " values (reflect):");
        printValues(sqrtMethod, 0.01, 1, 0.1);
        System.out.println();

        System.out.println(toHexMethod.getName() + " values (reflect):");
        printValues(toHexMethod, 0, 10, 1);
        System.out.println();

        System.out.println(sqrtMethod.getName() + " values (interface):");
        printValues1(Math::sqrt, 0.01, 1, 0.1);
        System.out.println();

        System.out.println(toHexMethod.getName() + " values (interface):");
        printValues1(Double::toHexString, 0, 10, 1);
        System.out.println();
    }
}
