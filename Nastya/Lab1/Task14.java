package Lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> twoD_arr = new ArrayList<ArrayList<Integer>>();
        while (true) {
            String str = in.nextLine();
            if (str.equals("")) break;
            ArrayList<Integer> arr = new ArrayList<>();
            String[] arrStr = str.split(" ");
            for (String el: arrStr) {
                arr.add(Integer.parseInt(el));
            }
            twoD_arr.add(arr);
        }
        if (checkMagic(twoD_arr))
            System.out.println("This is magic square!");
        else
            System.out.println("This is not magic square!");
    }

    public static boolean checkMagic(ArrayList<ArrayList<Integer>> twoD_arr) {
        int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
        int size = twoD_arr.size(); int constSum = 0;
        for (int i = 0; i < size; i++) {
            constSum += twoD_arr.get(0).get(i);
        }

        for (int i = 0; i < size; i++) {
            sum3 += twoD_arr.get(i).get(i);
            sum4 += twoD_arr.get(i).get(size-1-i);
            for (int j = 0; j < size; j++) {
                sum1 += twoD_arr.get(i).get(j);
                sum2 += twoD_arr.get(j).get(i);
            }
            if (sum1 != constSum || sum2 != constSum)
                return false;
            sum1 = 0; sum2 = 0;
        }

        if (sum3 != constSum || sum4 != constSum)
            return false;
        return true;
    }
}
