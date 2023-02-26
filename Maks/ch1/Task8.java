package ch1;

import java.util.Scanner;
import java.util.ArrayList;
public class Task8 {
    private final static char[] separators = {' ', '\t', ',', '.'};
    public static ArrayList<String> getAllSubstrings(String string){
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0;i < string.length();++i){
            String output = "";
            int currentSum = i;
            while(currentSum < string.length()){
                output = output + string.charAt(currentSum);
                currentSum += 1;
                result.add(output);
            }
        }
        return result;
    }
    private static boolean isSeparator(char character){
        for(char separator : separators){
            if(character == separator){
                return true;
            }
        }
        return false;
    }
    public static ArrayList<String> getAllWords(String string){
        ArrayList<String> result = new ArrayList<>();
        int startPos = 0, endPos;

        while(isSeparator(string.charAt(startPos))){
            startPos += 1;
        }

        while(startPos < string.length()){
            endPos = startPos + 1;
            while(endPos < string.length() && !isSeparator(string.charAt(endPos))){
                endPos += 1;
            }
            result.add(string.substring(startPos, endPos));
            startPos = endPos + 1;
            while(startPos < string.length() && isSeparator(string.charAt(startPos))){
                startPos += 1;
            }
        }

        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        ArrayList<String> allSubstrings = getAllSubstrings(string);
        System.out.println("Substrings:");
        for(String substring : allSubstrings){
            System.out.println(substring);
        }

        ArrayList<String> allWords = getAllWords(string);
        System.out.println("Words:");
        for(String words : allWords){
            System.out.println(words);
        }
    }
}
