package extra.ch1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3other {
    public static void main(String[] args) {
        try {
            int[] numbers = readInts();
            System.out.println(Arrays.toString(numbers));
            System.out.println("The max value 1: " + firstMethod(numbers));
            System.out.println("The max value 2: " + secondMethod(numbers));
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }

    public static int firstMethod(int ...numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number >= max)
                max = number;
        }
        return max;
    }

    public static int secondMethod(int ...numbers) {
        int max = 0;
        for (int number : numbers) {
            max = Math.max(number, max);
        }
        return max;
    }

    public static int[] readInts() {
        int arg;
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter the integer numbers -> ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            while (in.hasNext()) {
                numbers.add(in.nextInt());
            }
        } else throw new NumberFormatException("Invalid input: not a number");

        int[] result = new int[numbers.size()];
        for(int i = 0;i < numbers.size();++i){
            result[i] = numbers.get(i);
        }

        return result;
    }
}
