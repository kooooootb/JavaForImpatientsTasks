package Lab2.Task3;

public class Employee {
    private String name;
    private int salary;
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // метод доступа типа void
    public void printEmployee() {
        System.out.println(this.name + ": " + this.salary);
    }

    // модифицирующий метод типа double (изменяет salary и возвращает новый налог на нее)
    public double salaryIncrease(int inc) {
        this.salary = this.salary + inc;
        return this.salary*0.07;
    }

    public static void main(String[] args) {
        Employee obj = new Employee("Andrew", 15000);
        obj.printEmployee();
        double tax =  obj.salaryIncrease(5000);
        obj.printEmployee();
        System.out.println(tax);
    }
}
