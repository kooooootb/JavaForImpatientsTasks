package extra.ch1;

import java.util.Random;
import java.util.Scanner;

public class task_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        Random rand = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        while(stringBuilder.length() < length){
            int rest = length - stringBuilder.length();
            String str = Long.toUnsignedString(rand.nextLong(), 36);
            if(rest >= str.length()){
                stringBuilder.append(str);
            } else{
                stringBuilder.append(str, 0, rest);
            }
        }

        String result = stringBuilder.toString();
        System.out.println(result);
    }
}
