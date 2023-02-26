package ch1;

import java.util.Random;
public class Task10 {
    public static String convertTo36Base(long number){
        StringBuilder result = new StringBuilder();
        boolean needMinus = false;

        if(number < 0){
            number = -number;
            needMinus = true;
        }

        int remainder;
        while(number > 0){
            remainder = (int) (number % 36);

            if(remainder < 10){
                result.append(remainder);
            } else{
                result.append((char) (remainder - 10 + 'A'));
            }

            number /= 36;
        }

        if(needMinus){
            result.append("-");
        }
        return result.reverse().toString();
    }

    public static void main(String[] args){
        Random generator = new Random();
        long number = generator.nextLong();
        String n36 = convertTo36Base(number);
        System.out.println(number + " -> " + n36);
    }
}
