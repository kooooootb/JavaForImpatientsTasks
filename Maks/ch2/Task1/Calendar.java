package ch2.Task1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {
    public static int offset = 1;
    private static void printWeekDays(){
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
    private static int getOffsetValue(DayOfWeek day){
        return (day.getValue() + 1) % 7;
    }
    public static void showCalendar(int year, int month){
        //first row
        printWeekDays();

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek day = date.getDayOfWeek();
        int dayWeekValue = getOffsetValue(day);

        //second row
        for(int i = 0;i < dayWeekValue - 1;++i){
            System.out.print("    ");
        }
        for(int i = dayWeekValue;i <= 7;++i){
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
        }
        System.out.println();

        //other rows
        while(month == date.getMonthValue()){
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
        }
    }

    public static void main(String[] args){
        showCalendar(2023, 2);
    }
}
