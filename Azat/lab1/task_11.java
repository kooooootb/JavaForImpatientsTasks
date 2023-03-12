import java.util.Scanner;

public class task_11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter string:");
        String str = in.nextLine();

        str.codePoints()
                .filter(c -> c > 255)
                .forEach(c -> System.out.print("\nchar:" + (char) c + " unicode:" + c));

    }
}
