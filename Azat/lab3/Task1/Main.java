package ch3.Task1;

public class Main {
    public static double average(Measurable[] measurables){
        double result = 0;
        for(Measurable measurable : measurables){
            result += measurable.getMeasure();
        }
        return result / measurables.length;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(100);
        Employee e2 = new Employee(200);
        Employee e3 = new Employee(250);
        Employee e4 = new Employee(300);
        Employee e5 = new Employee(350);
        Employee e6 = new Employee(400);
        Employee e7 = new Employee(500);

        Employee[] employees = {e1, e2, e3, e4, e5, e6, e7};

        System.out.println(average(employees));
    }
}
