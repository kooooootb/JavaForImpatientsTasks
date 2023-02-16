package ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Task13 {
    public static void main(String[] args){
        int[] result = new int[6];

        for(int j = 0;j < 6;++j){
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int i = 1;i < 50;++i){
                arrayList.add(i);
            }

            Random generator = new Random();
            int index = Math.floorMod(generator.nextInt(), 50);
            // System.out.printf("Removing %d", arrayList.get(index));
            result[j] = arrayList.get(index);
            arrayList.remove(index);
        }

        Arrays.sort(result);
        for(int i = 0;i < 6;++i){
            System.out.printf("%d ", result[i]);
        }
    }
}
