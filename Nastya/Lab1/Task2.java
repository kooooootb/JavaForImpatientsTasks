package Lab1;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        try {
            int angle = ReadInt();
            System.out.println("Normalized angle 1: " + normalizeAngle1(angle));
            System.out.println("Normalized angle 2: " + normalizeAngle2(angle));
        } catch (NumberFormatException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static int normalizeAngle1(int angle)  {
        angle = angle % 359;
        if (angle < 0)
            angle += 360;
        return angle;
    }

    public static int normalizeAngle2(int angle)  {
        return Math.floorMod(angle, 359);
    }
    public static int ReadInt() {
        System.out.print("Enter the integer value of angle -> ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt())
            return in.nextInt();
        else
            throw new NumberFormatException("Invalid input: " + in.nextLine() + " is not a number");
    }
}