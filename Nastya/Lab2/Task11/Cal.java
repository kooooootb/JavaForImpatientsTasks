package Lab2.Task11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.LocalDate.of;
import static java.lang.System.*;
import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        out.print("Enter the month and year -> ");
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int year = in.nextInt();
        showMonthOfCal(month, year);
    }

    public static void printDaysOfWeek() {
        for (int i = 0; i < 7; i++) {
            out.print(DayOfWeek.of((i + 6) % 7 + 1).toString().substring(0, 3) + "  ");
        }
    }

    public static void showMonthOfCal(int month, int year) {
        LocalDate date = of(year, month, 1);
        printDaysOfWeek();
        out.println();
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        for (int i = 1; i <= value; i++)
            out.print("     ");
        while (date.getMonthValue() == month) {
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY)
                out.println();
            if (date.getDayOfMonth() < 10)
                out.print(date.getDayOfMonth() + "    ");
            else
                out.print(date.getDayOfMonth() + "   ");
            date = date.plusDays(1);
        }
    }
}