package Lab1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        String str = readStr();
        int[] codePoints = str.codePoints().toArray();
        for (int i : codePoints) {
            if (i >= 128) {
                System.out.println("Symbol: " + ((char) i) + " | Symbol's code: " + i);
            }
        }
    }

    public static String readStr() {
        System.out.print("Enter the string -> ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
