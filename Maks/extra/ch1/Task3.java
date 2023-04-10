package extra.ch1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static ArrayList<Integer> readInt1(){
        System.out.print("Enter the integer numbers -> ");
        Scanner scanner = new Scanner(System.in);
        String[] numstrs = scanner.nextLine().split(" ");

        ArrayList<Integer> numbers = new ArrayList<>();
        for(String numstr : numstrs){
            numbers.add(Integer.parseInt(numstr));
        }

        return numbers;
    }
    public static ArrayList<Integer> readInt() {
        System.out.print("Enter the integer numbers -> ");
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (in.hasNextInt()){
            numbers.add(in.nextInt());
        }

        return numbers;
    }
    public static int getMax1(ArrayList<Integer> numbers){
        if(numbers.isEmpty()){
            return 0;
        }

        int result = Integer.MIN_VALUE;
        for(int number : numbers){
            if(number > result){
                result = number;
            }
        }

        return result;
    }
    public static int getMax2(ArrayList<Integer> numbers){
        if(numbers.isEmpty()){
            return 0;
        }

        int result = Integer.MIN_VALUE;
        for(int number : numbers){
            result = Math.max(number, result);
        }

        return result;
    }
    public static void main(String[] args) {
        // readInt1 - until new line
        // readInt2 - until EOF
        ArrayList<Integer> numbers = readInt1();

        int max;
        // getMax1 - with ifs
        // getMax1 - with Math.max
        max = getMax1(numbers);
        System.out.println("The max value: " + max);
        max = getMax2(numbers);
        System.out.println("The max value: " + max);

    }

}