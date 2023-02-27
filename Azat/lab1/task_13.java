import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class task_13 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 49; i++) {
            nums.add(i + 1);
        }

        Collections.shuffle(nums);

        int[] indexes = new int[6];
        for (int i = 0; i < 6; i++) {
            indexes[i] = (int) Math.round((Math.random() * 50) % 50);
        }
        for (int i = 0; i < 6; i++) {
            indexes[i] = nums.get(indexes[i]);
        }

        Arrays.sort(indexes);
        for (int i = 0; i < indexes.length; i++) {
            System.out.print(indexes[i] + " ");
        }
    }

}
