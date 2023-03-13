package ch1;

import java.util.Scanner;
import java.math.BigInteger;
public class Task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n < 0){
            System.out.println("Can't work with negatives");
            return;
        }

        BigInteger result = BigInteger.valueOf(1);
        for(int i = 2;i <= n;++i){
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}
