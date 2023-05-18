import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] values = new Object[1000];
        for(int i = 0; i < values.length ; i++){
            Object value = i;
            values[i] = Proxy.newProxyInstance(
                    Integer.class.getClassLoader(),
                    new Class[]{Comparable.class},
                    (Object proxy, Method m,Object[] margs) ->{
                        System.out.println(value + "." + m.getName()
                                + Arrays.toString(margs));
                        return m.invoke(value,margs);
                    }
            );
        }
        Arrays.binarySearch(values,Integer.valueOf(500));
    }
}