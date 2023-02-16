package ch1;

import java.util.Scanner;
public class Task16 {
    public static double average(double result, double ...numbers){
        for(double number : numbers){
            result += number;
        }
        return result / (numbers.length + 1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(average(1.1, 1.4, 1.7, 2));
    }
}
