package ch1;

import java.util.ArrayList;
import java.util.Scanner;
public class Task14 {
    public static void main(String[] args){
        // get input
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> square = new ArrayList<>();
        String string;
        do{
            string = scanner.nextLine();
            if(string.equals("")){
                break;
            }

            square.add(new ArrayList<>());
            String[] strnums = string.split(" ");

            for(String strnum : strnums){
                int number = Integer.parseInt(strnum);
                square.get(square.size() - 1).add(number);
            }
        }while(true);

        // get sum from 1st row
        int size = square.size();
        int sum = 0;
        for(int i = 0;i < size;++i){
            sum += square.get(0).get(i);
        }

        // confirm rows
        for(int row = 1;row < size;++row){
            int currentSum = 0;
            for(int i = 0;i < size;++i){
                currentSum += square.get(row).get(i);
            }
            if(currentSum != sum){
                System.out.println(false);
                return;
            }
        }

        // confirm columns
        for(int column = 0;column < size;++column){
            int currentSum = 0;
            for(int i = 0;i < size;++i){
                currentSum += square.get(i).get(column);
            }
            if(currentSum != sum){
                System.out.println(false);
                return;
            }
        }

        // confirm diagonales
        int currentSum = 0;
        for(int i = 0;i < size;++i){
            currentSum += square.get(i).get(i);
        }
        if(currentSum != sum){
            System.out.println(false);
            return;
        }
        currentSum = 0;
        for(int i = 0;i < size;++i){
            currentSum += square.get(size - i - 1).get(i);
        }
        if(currentSum != sum){
            System.out.println(false);
            return;
        }

        System.out.println(true);
    }
}
//        16 3 2 13
//        5 10 11 8
//        9 6 7 12
//        4 15 14 1
