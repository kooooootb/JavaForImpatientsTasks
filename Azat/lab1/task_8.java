import java.util.Scanner;

public class task_8 {
    public static void printCharsArray(char[] chars){
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        for (int i = 0; i < string.length(); i++) {//внешний цикл задает длину подстроки
            int start;
            int finish;
            for (int j = 0; j < string.length() - i; j++) {//внутренний цикл задает индексы начала и конца подстроки длины i
                //ясно,что в строке длины m можно выделить k подстрок m - k способами
                char[] dict = new char[i + 1];
                start = j;
                finish = i + j;
                string.getChars(start,finish+1,dict,0);
                printCharsArray(dict);
            }

        }
    }
}
