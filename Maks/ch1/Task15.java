package ch1;

import java.util.ArrayList;
import java.util.Scanner;
public class Task15 {
    public static void main(String[] args){
        // create scanner object
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // resulting array
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // n is negative or zero => empty array
        if(n < 1){
            return;
        }

        // set first row
        result.add(new ArrayList<>());
        result.get(0).add(1);

        // fill array from second row
        for(int i = 1;i < n;++i){
            // array for row
            result.add(new ArrayList<>());
            ArrayList<Integer> row = result.get(i);

            // fill row
            for(int j = 0;j < i + 1;++j){
                row.add((j < i ? result.get(i-1).get(j) : 0) + (j > 0 ? result.get(i-1).get(j-1) : 0));
            }
        }

        // print out
        // amount of whitespaces before numbers
        int whitespaces = n - 1;
        // length of maximum number
        int maxLength = Integer.toString(result.get(result.size() - 1).get((result.get(result.size() - 1).size() - 1) / 2)).length() + 1;
        if(maxLength % 2 == 1){
            maxLength += 1;
        }
        for(ArrayList<Integer> arrayList : result){
            // add whitespaces for formatting
            for(int i = 0;i < whitespaces;++i){
                for(int j = 0;j < maxLength / 2;++j){
                    System.out.print(" ");
                }
            }
            whitespaces -= 1;

            // print numbers
            for(Integer number : arrayList){
                System.out.printf("%" + maxLength + "d", number);
            }
            System.out.println();
        }
    }
}
