//import java.math.Integer;
import java.util.ArrayList;
import java.util.Scanner;

public class task_15 {

    public static Integer factorial(Integer value){
        if(value == 1 || value == 0)
            return 1;
        return value * factorial(value - 1);
    }

    public static Integer C(Integer n, Integer k){
        return factorial(n)/(factorial(k) * factorial(n - k));
    }

    public static void PrintPascal(ArrayList<ArrayList<Integer>> list){
        // найдём самое широкое число
        // по свойству треугольника Паскаля, это число в середине нижнего ряда
        int maxNum = list.get(list.size() - 1).get((list.size() - 1)/2);//s[strings - 1][(strings - 1)/2];
        int maxNumWidth = Integer.toString(maxNum).length();

        // теперь цикл вывода
        for (int i = 0; i < list.size(); i++) {
            // насколько ширина данной колонки не дотягивает до наибольшей?
            // для центрирования делим пополам
            int stringPad = (list.size() - 1 - i) * (maxNumWidth + 1) / 2;
            if (stringPad > 0) // не нашёл лучше способа создать строку пробелов
                System.out.print(String.format("%" + stringPad + "s", ""));
            for (int j = 0; j <= i; j++) {
                String paddedNum = Integer.toString(list.get(i).get(j));//s[i][j]);
                // центрируем число в своей колонке тоже
                int totalPad = maxNumWidth - paddedNum.length();
                int rPad = totalPad / 2;
                if (rPad > 0)
                    paddedNum = String.format("%s%" + rPad + "s", paddedNum, "");
                int lPad = totalPad - rPad;
                if (lPad > 0)
                    paddedNum = String.format("%" + lPad + "s%s", "", paddedNum);
                System.out.print(paddedNum);
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        int N = scanner.nextInt();

        for (int i = 1; i <= N ; i++) {
            ArrayList<Integer> tmp_list = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                tmp_list.add(C(i,j));

            }
            list.add(tmp_list);
        }

        PrintPascal(list);

    }
}
