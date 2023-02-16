package ch1;

import java.util.Scanner;
import java.lang.Math;
public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int angle = scanner.nextInt();
        final int norm = 360;
        System.out.println((angle % norm + norm) % norm);
        System.out.println(Math.floorMod(angle, norm));
    }
}
