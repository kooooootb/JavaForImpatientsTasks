package ch3.Task2;

public class Employee implements Measurable {
    private double salary;
    private String name;
    Employee(String name, double salary){
        this.salary = salary;
        this.name = name;
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
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
