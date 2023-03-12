package Lab2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter the month and year -> ");
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int year = in.nextInt();
        showMonthOfCal(month, year);
    }

    public static void printDaysOfWeek() {
        for (int i = 0; i < 7; i++) {
            System.out.print(DayOfWeek.of((i + 6) % 7 + 1).toString().substring(0, 3) + "  ");
        }
    }

    public static void showMonthOfCal(int month, int year) {
        LocalDate date = LocalDate.of(year, month, 1);
        printDaysOfWeek();
        System.out.println();
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        for (int i = 1; i <= value; i++)
            System.out.print("     ");
        while (date.getMonthValue() == month) {
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY)
                System.out.println();
            if (date.getDayOfMonth() < 10)
                System.out.print(date.getDayOfMonth() + "    ");
            else
                System.out.print(date.getDayOfMonth() + "   ");
            date = date.plusDays(1);
        }
    }
}
