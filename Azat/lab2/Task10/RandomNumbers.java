package ch2.Task10;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    private final static Random generator = new Random();
    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low);
    }
    public static int nextArray(int[] array){
        return array.length == 0 ? 0 : array[nextInt(0, array.length)];
    }
    public static int nextArray(ArrayList<Integer> list){
        return list.size() == 0 ? 0 : list.get(nextInt(0, list.size()));
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(nextArray(array));
        System.out.println(nextArray(array));
        System.out.println(nextArray(array));

        ArrayList<Integer> list = new ArrayList<>(10);
        for(int i = 0;i < 10;++i){
            list.add(i);
        }
        System.out.println(nextArray(list));
        System.out.println(nextArray(list));
        System.out.println(nextArray(list));
    }
}
