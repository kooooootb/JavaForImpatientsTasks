package ch1;

import java.util.ArrayList;
import java.util.Scanner;
public class Task15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n < 1){
            return;
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>());
        result.get(0).add(1);

        for(int i = 1;i < n;++i){
            result.add(new ArrayList<>());

            for(int j = 0;j < i + 1;++j){
                result.get(i).add((j < i ? result.get(i-1).get(j) : 0) + (j > 0 ? result.get(i-1).get(j-1) : 0));
            }
        }

        for(ArrayList<Integer> arrayList : result){
            for(Integer number : arrayList){
                System.out.printf("%d ", number);
            }
            System.out.println();
        }
    }
}
