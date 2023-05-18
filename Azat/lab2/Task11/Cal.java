package ch2.Task11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.LocalDate.of;
import static java.lang.System.out;

public class Cal {
    public final static int offset = 1;
    private static void printWeekDays(){
        out.println(" Sun Mon Tue Wed Thu Fri Sat");
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
            out.print("    ");
        }
        for(int i = dayWeekValue;i <= 7;++i){
            out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
        }
        out.println();

        //other rows
        while(month == date.getMonthValue()){
            out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
        }
    }

    public static void main(String[] args){
        showCalendar(2023, 2);
    }
}
