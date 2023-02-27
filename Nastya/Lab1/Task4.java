package Lab1;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("MIN Double: " + Double.MIN_VALUE + "\nMAX Double: " + Double.MAX_VALUE);
        System.out.println("The min double value: " + Math.nextUp(0.0));
        System.out.println("The max double value: " + Math.nextDown(1.0 / 0));
    }
}
