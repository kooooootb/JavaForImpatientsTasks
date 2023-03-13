package extra.ch1;

public class Task1Imit {
    public static<T> T get(T[] array, int length, int index){
        if(index >= length){
            throw new IndexOutOfBoundsException();
        }

        return array[index];
    }

    public static void main(String[] args) {
        Integer[] a1 = {1, 2};

        System.out.println(get(a1, 2, 1));
        System.out.println(get(a1, 2, 0));

        Integer[] a2 = {3, 4, 5, 6, 7};

        System.out.println(get(a2, 5, 1));
        System.out.println(get(a2, 5, 2));
        System.out.println(get(a2, 5, 4));
    }
}
