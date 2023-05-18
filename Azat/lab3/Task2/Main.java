package ch3.Task2;

public class Main {
    public static Measurable largest(Measurable[] measurables){
        if(measurables.length == 0){
            return null;
        }
        Measurable result = measurables[0];
        for(int i = 1;i < measurables.length;++i){
            if(measurables[i].getMeasure() > result.getMeasure()){
                result = measurables[i];
            }
        }
        return result;
    }
    public static double average(Measurable[] measurables){
        double result = 0;
        for(Measurable measurable : measurables){
            result += measurable.getMeasure();
        }
        return result / measurables.length;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("first", 100);
        Employee e2 = new Employee("second", 700);
        Employee e3 = new Employee("third", 250);
        Employee e4 = new Employee("fourth", 600);
        Employee e5 = new Employee("fifth", 350);
        Employee e6 = new Employee("sixth", 400);
        Employee e7 = new Employee("seventh", 500);

        Employee[] employees = {e1, e2, e3, e4, e5, e6, e7};

        Employee largestEmployee = (Employee) largest(employees);
        System.out.println(largestEmployee == null ? null : largestEmployee.getName());
    }
}
