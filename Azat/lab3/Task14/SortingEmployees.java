package ch3.Task14;

import java.util.Arrays;
import java.util.Comparator;

public class SortingEmployees {
    public static class Employee{
        private final int salary;
        private final String name;
        Employee(int salary, String name){
            this.salary = salary;
            this.name = name;
        }
        public String getName(){
            return name;
        }
        public int getSalary(){
            return salary;
        }
        public String toString(){
            return String.format("name: %s, salary: %d", name, salary);
        }
    }
    public static void sort(Employee[] employees){
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
    }
    public static void sortReversed(Employee[] employees){
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName).reversed());
    }
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(100, "aa"),
                new Employee(200, "ab"),
                new Employee(100, "bb"),
                new Employee(200, "cc"),
                new Employee(100, "cf"),
        };
        sort(employees);
        System.out.println("Normal sort: " + Arrays.toString(employees));
        sortReversed(employees);
        System.out.println("Reversed sort: " + Arrays.toString(employees));
    }
}
