package extra;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Класс дает статический метод конструирования массива объектов заданного класса
 */
public class Fabric {
    /**
     * Нестатические методы или поля отсутствуют, создавать объект не имеет смысла
     */
    private Fabric() {};
    /**
     * Класс для тестирования, имеет два поля int
     */
    static class A{
        final private int a, b;
        public A(Integer a, Integer b){
            this.a = a;
            this.b = b;
        }
        /**
         * Строковое представление класса
         * @return строка, представляющая класс
         */
        public String toString(){
            return "[A class: a: " + this.a + ", b: " + this.b + "]";
        }
    }

    /**
     * Класс для тестирования, имеет поле int, поле String и double
     */
    static class B{
        final private int a;
        final private String b;
        final private double c;
        public B(Integer a, String b, Double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        /**
         * Строковое представление класса
         * @return строка, представляющая класс
         */
        public String toString(){
            return "[B class: a: " + this.a + ", b: \"" + this.b + "\", c: " + this.c +"]";
        }
    }

    private static boolean checkEqualAmount(Object[][] args){
        if(args.length < 1){
            return true;
        }

        int amount = args[0].length;
        for(int i = 1;i < args.length;++i){
            if(args[i].length != amount){
                return false;
            }
        }

        return true;
    }

    /**
     * Функция конструирует класс, переданный параметром tClass
     * @param tClass объект класса класса
     * @param args переменной длины массив массивов аргументов для конструктора класса
     * @return массив классов
     * @param <T> класс, массив которого создается
     */
    public static <T> T[] get(Class<T> tClass, Object[] ...args){
        Logger logger = Logger.getGlobal();

        // check for empty input
        if(args.length == 0){
            logger.log(Level.INFO, "Invalid arguments arrays: can't construct object array without arguments");
            return null;
        }

        // check for arrays with different size
        if(!checkEqualAmount(args)){
            logger.log(Level.INFO, "Invalid arguments arrays: sizes of arrays are not equal");
            return null;
        }

        // get array of class objects for arguments
        Class<?>[] parameterTypes = new Class[args.length];
        int i = 0;
        for(Object[] parameter : args){
            parameterTypes[i++] = parameter[0].getClass();
        }

        // get constructor object
        Constructor<T> constructor;
        try {
            constructor = tClass.getConstructor(parameterTypes);
        } catch(NoSuchMethodException ex){
            logger.log(Level.INFO, "Can't get constructor", ex);
            return null;
        }

        // build objects
        T[] result = (T[]) Array.newInstance(tClass, args[0].length);
        for(i = 0;i < args[0].length;++i){
            Object[] arg = new Object[args.length];
            for(int j = 0;j < args.length;++j){
                arg[j] = args[j][i];
            }

            try {
                result[i] = (T) constructor.newInstance(arg);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }

        return result;
    }

    /**
     * Тестирующий статический метод
     */
    public static void main(String[] args) {
        Integer[] aaargs = {1, 3};
        Integer[] abargs = {2, 4};
        A[] aobjs = get(A.class, aaargs, abargs);

        Integer[] baargs = {12, 423, 12311};
        String[] bbargs = {"asd", "qwe", "zxc"};
        Double[] bcargs = {0.123, 0.512, 213.213};
        B[] bobjs = get(B.class, baargs, bbargs, bcargs);

        if(aobjs != null) for(A obj : aobjs){
            System.out.println(obj);
        }

        if(bobjs != null) for(B obj : bobjs){
            System.out.println(obj);
        }
    }
}
