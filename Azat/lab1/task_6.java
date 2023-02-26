import java.math.BigInteger;
import java.util.Scanner;

public class task_6 {

    public static BigInteger factorial(BigInteger value){
        if(value.equals(new BigInteger("1")) || value.equals(new BigInteger("0")))
            return new BigInteger("1");
        return value.multiply(factorial(value.add(new BigInteger("-1"))));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmp = Integer.toString(scanner.nextInt());
        BigInteger value = new BigInteger(tmp);
        System.out.println(factorial(value));
    }
}
