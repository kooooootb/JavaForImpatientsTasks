package ch1;

import java.util.Scanner;
public class Task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int normValue = Short.MAX_VALUE + 1;
        short a = (short) (scanner.nextInt() - normValue), b = (short) (scanner.nextInt() - normValue);
        System.out.printf("Сумма: %d", a + normValue + b + normValue);
        System.out.printf("Разность: %d", a - b);
        System.out.printf("Умножение: %d", (a + normValue) * (b + normValue));
        System.out.printf("Деление: %d", (a + normValue) / (b + normValue));
        System.out.printf("Остаток от деления: %d", (a + normValue) % (b + normValue));
    }
}
