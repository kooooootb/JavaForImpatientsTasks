package Lab1;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        try {
            int n = ReadInt();
            System.out.println("Binary form: " + Integer.toBinaryString(n));
            System.out.println("Octal form: " + Integer.toOctalString(n));
            System.out.println("Hexadecimal form: " + Integer.toHexString(n));
            System.out.println("The return value in hexadecimal floating point form: " + Double.toHexString((double) 1/n));
        } catch (NumberFormatException exception) {
            System.out.println(exception.getMessage());
        }
    }
    public static int ReadInt() {
        System.out.print("Enter the integer number -> ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt())
            return in.nextInt();
        else
            throw new NumberFormatException("Invalid input: " + in.nextLine() + " is not a number");
    }
}