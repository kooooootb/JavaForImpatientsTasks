package ch1;

import java.util.Scanner;
public class Task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short a = (short) (scanner.nextInt() - Short.MAX_VALUE), b = (short) (scanner.nextInt() - Short.MAX_VALUE);
        System.out.println(a + Short.MAX_VALUE + b + Short.MAX_VALUE);
        System.out.println(a - b);
        System.out.println((a + Short.MAX_VALUE) * (b + Short.MAX_VALUE));
        System.out.println((a + Short.MAX_VALUE) / (b + Short.MAX_VALUE));
        System.out.println((a + Short.MAX_VALUE) % (b + Short.MAX_VALUE));
    }
}
