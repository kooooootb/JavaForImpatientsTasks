package Lab1;

public class Task16 {
    public static void main(String[] args) {
        System.out.println(average(324,45, 3));
//        System.out.println(average()); - Error! Cannot resolve method 'average()'
    }
    public static double average(double x, double... values) {
        double sum = x;
        for (double v : values)
            sum += v;
        return sum / (values.length+1);
    }
}
