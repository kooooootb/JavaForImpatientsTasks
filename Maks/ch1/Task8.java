package ch1;

import java.util.Scanner;
public class Task8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        for(int i = 0;i < string.length();++i){
            String output = "";
            int currentSum = i;
            while(currentSum < string.length()){
                output = output + string.charAt(currentSum);
                currentSum += 1;
                System.out.println(output);
            }
        }
    }
}
