package ch1;

import java.util.Scanner;
public class Task3 {
    private static int max(int ...numbers){
        if(numbers.length < 1) return 0;
        int result = numbers[0];
        for(int i = 1;i < numbers.length;++i){
            if(numbers[i] > result){
                result = numbers[i];
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for(int i = 0;i < 3;++i){
            numbers[i] = scanner.nextInt();
        }

        if(numbers[1] > numbers[0]){
            if(numbers[2] > numbers[1]){
                System.out.println(numbers[2]);
            } else{
                System.out.println(numbers[1]);
            }
        } else{
            if(numbers[0] > numbers[2]){
                System.out.println(numbers[0]);
            } else{
                System.out.println(numbers[2]);
            }
        }

        System.out.println(Math.max(numbers[0], Math.max(numbers[1], numbers[2])));

        System.out.println(max(numbers));
    }
}
