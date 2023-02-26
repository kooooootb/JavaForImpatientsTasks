package ch1;

import java.util.Scanner;
public class Task16 {
//    public static double average(double... values) {
//        double sum = 0;
//        for (double v : values) sum += v;
//        return values.length == 0 ? 0 : sum / values.length;
//    }
    public static double average(double result, double ...numbers){
        for(double number : numbers){
            result += number;
        }
        return result / (numbers.length + 1);
    }
    public static void main(String[] args){
        double averageNum = average(1.1, 1.4, 1.7, 2);
        System.out.println(averageNum);
    }
}
