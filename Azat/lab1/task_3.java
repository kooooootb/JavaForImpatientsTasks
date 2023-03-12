import java.util.Scanner;
import java.lang.Math;
public class task_3 {
    public static int max(int a,int b,int c){
        if(a >= b && b >= c)
            return a;
        if(a >= c && c >= b)
            return a;
        if(b >= a && a >= c)
            return b;
        if(b >= c)
            return b;
        return c;

    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println(max(a,b,c));
        System.out.println(Math.max(Math.max(a,b),c));
    }
}
