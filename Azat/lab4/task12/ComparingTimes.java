package ch4.task12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

public class ComparingTimes {
    public static String example(String string){
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(" ");

        for(int i = 0;i < 1000;++i){
            sb.append(i);
        }

        return sb.toString() + " proccessed";
    }
    public static void main(String[] args) {
        Method method;
        try{
            method = ComparingTimes.class.getMethod("example", String.class);
        } catch(NoSuchMethodException e){
            throw new RuntimeException(e);
        }

        long before;
        long after;
        String result;

        try {
            before = System.nanoTime();
            result = (String) method.invoke(null, "task");
            after = System.nanoTime();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        System.out.println("invoke with reflection: " + (after - before));

        before = System.nanoTime();
        result = example("task");
        after = System.nanoTime();
        System.out.println("simple invoke: " + (after - before));
    }
}
