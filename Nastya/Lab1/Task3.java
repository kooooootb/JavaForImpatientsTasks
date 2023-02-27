package Lab1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try {
            int a = ReadInt();
            int b = ReadInt();
            int c = ReadInt();

            // first method
            if (a == b && a == c) {
                System.out.println("All the numbers are equals: " + a);
            } else {
                int max = a > b ? a : b;
                if (c > max) {
                    max = c;
                }
                System.out.println("The max value 1: " + max);
            }

            // second method
            int max = Math.max(a,b);
            max = Math.max(max, c);
            System.out.println("The max value 2: " + max);

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