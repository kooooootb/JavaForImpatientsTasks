package Lab1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = readStr();
        String[] substr = str.split("\\s+");
//        while(in.hasNext()) {
//            String substr = in.next();
//            if (Objects.equals(substr, "\\n")) {
//                System.out.println("FUUUCK");
//                break;
//            }
//            System.out.println(substr);
//        }
        System.out.println(Arrays.toString(substr));
    }

    public static String readStr() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}