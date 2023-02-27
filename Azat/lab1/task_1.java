import java.util.Scanner;
//'A' - 65
public class task_1 {
    public static void process(int num,int radix){
        StringBuilder result = new StringBuilder();

        while (num > 0) {
            if(radix == 16 && num % radix >= 10)
                result.append((char)(num % radix + 55));
            else
                result.append(Integer.toString(num % radix));
            num /= radix;
        }

        System.out.println(result.reverse());

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int radix = scanner.nextInt();
        process(num,radix);
        System.out.println(Double.toHexString(1. / (double)num));
    }
}