package Lab1;

import java.math.BigInteger;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        try {
            int n = ReadPositiveInt();
            System.out.println(n + "!" + " = " + factorial(n));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static BigInteger factorial(int n) {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    public static int ReadPositiveInt() {
        System.out.print("Enter the integer positive number -> ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int n = in.nextInt();
            if (n > 0)
                return n;
            else
                throw new NumberFormatException("Invalid input: " + n + " is not a positive number");
        }
        else
            throw new NumberFormatException("Invalid input: " + in.nextLine() + " is not a number");
    }
}