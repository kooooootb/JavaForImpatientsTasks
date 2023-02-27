package Lab1;

import java.util.ArrayList;
import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 49; i++) {
            arr.add(i+1);
        }

        int [] res = new int[6];
        for (int i = 0; i < 6; i++) {
            int random = (int)(Math.random() * (48-i));
            res[i] = arr.get(random);
            arr.remove(random);
        }
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }
}