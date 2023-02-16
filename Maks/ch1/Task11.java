package ch1;

import java.util.Scanner;
public class Task11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int[] codePoints = string.codePoints().toArray();
        for(int codePoint : codePoints){
            if(codePoint > 127){
                System.out.printf("%c, code:%d\n", codePoint, codePoint);
            }
        }
    }
}
