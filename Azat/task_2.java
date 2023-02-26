import java.util.Scanner;
import java.lang.Math;
public class task_2 {
    public static int process(int value){
        return value > 0 ? value % 360 : value % 360 + 360;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(process(value));
        System.out.print(Math.floorMod(value,360));
    }
}
