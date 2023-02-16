package ch1;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toOctalString(number));
        System.out.println(Integer.toHexString(number));
        System.out.printf("%a", 1. / number);
    }
}
