package Lab1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        short a = ReadPositiveShort(), b = ReadPositiveShort();
        System.out.println(a + " | " + b);
        //System.out.println("SUM: " + (short) ((int) a+ (int) b));
        System.out.println(a + Short.MAX_VALUE + b + Short.MAX_VALUE);
        System.out.println("DIFF: " + (a - b) + " || " + Short.MAX_VALUE);
    }

    public static short ReadPositiveShort() {
        System.out.print("Enter the integer positive number (0 - 65535) -> ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int n = in.nextInt();
            if (n >= 0 && n <= 65535)
                return (short) (n - Short.MAX_VALUE);
            else
                throw new NumberFormatException("Invalid input: " + n + " is not a positive number or more than 65535");
        }
        else
            throw new NumberFormatException("Invalid input: " + in.nextLine() + " is not a number");
    }
}
