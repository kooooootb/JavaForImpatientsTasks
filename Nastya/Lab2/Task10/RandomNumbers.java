package Lab2.Task10;

import java.util.ArrayList;

public class RandomNumbers {
    public static int randomElement(ArrayList<Integer> arr) {
        if (arr.size() == 0)
            return 0;
        else {
            int random = (int) (Math.random() * arr.size());
            return arr.get(random);
        }
    }

    public static int randomElement(int[] arr) {
        if (arr.length == 0)
            return 0;
        else {
            int random = (int) (Math.random() * arr.length);
            return arr[random];
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr1.add(i);
        }
        System.out.println(randomElement(arr1));

        int[] arr2 = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(randomElement(arr2));

    }
}