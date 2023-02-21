package Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int n = ReadPositiveInt();
        ArrayList<ArrayList<Integer>> twoD_arr = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            twoD_arr.add(arr);
            for (int j = 0; j < i+1; j++) {
                if (j == 0 || j == i) {
                    twoD_arr.get(i).add(j, 1);
                } else {
                    twoD_arr.get(i).add(j, twoD_arr.get(i-1).get(j-1) + twoD_arr.get(i-1).get(j));
                }
            }
        }
        for (ArrayList<Integer> el: twoD_arr) {
            System.out.println(el);
        }

//        for (int i = twoD_arr.size()-1; i >= 0; i--) {
//            System.out.println(twoD_arr.get(i));
//        }
    }

    public static int ReadPositiveInt() {
        System.out.print("Enter the integer positive number -> ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int n = in.nextInt();
            if (n > 0)
                return n;
            else
                throw new NumberFormatException("Invalid input: " + n + " is not a positive number");
        }
        else
            throw new NumberFormatException("Invalid input: " + in.nextLine() + " is not a number");
    }
}
