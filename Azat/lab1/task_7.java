import java.util.Scanner;

public class task_7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int normValue = Short.MAX_VALUE + 1;
        short a = (short) (scanner.nextInt() - normValue), b = (short) (scanner.nextInt() - normValue);
        System.out.printf("Сумма: %d\n", a + normValue + b + normValue);
        System.out.printf("Разность: %d\n", a - b);
        System.out.printf("Умножение: %d\n", (a + normValue) * (b + normValue));
        System.out.printf("Деление: %d\n", (a + normValue) / (b + normValue));
        System.out.printf("Остаток от деления: %d\n", (a + normValue) % (b + normValue));
    }
}
