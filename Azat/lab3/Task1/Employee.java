package ch3.Task1;

public class Employee implements Measurable{
    private double salary;
    Employee(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    @Override
    public double getMeasure() {
        return getSalary();
    }
}
