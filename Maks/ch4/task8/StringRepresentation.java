package ch4.task8;

import java.util.ArrayList;

public class StringRepresentation {
    public static class Employee{
        int salary;
        String name;
        Employee(String name, int salary){
            this.name = name;
            this.salary = salary;
        }
    }
    public static void main(String[] args) {
        Player player = new Player("Name", 1, 1);
        int[] array = {1, 2, 3, 4, 5};
        ArrayList<Double> arrayList = new ArrayList<>(); arrayList.add(1.); arrayList.add(2.); arrayList.add(3.);
        Employee employee = new Employee("John", 100);

        Class<?> playerClass = player.getClass();
        Class<?> arrayClass = array.getClass();
        Class<?> arrayListClass = arrayList.getClass();
        Class<?> employeeClass = employee.getClass();
        Class<?> floatClass = float.class;

        System.out.println("getCanonicalName");
        System.out.println(playerClass.getCanonicalName());
        System.out.println(arrayClass.getCanonicalName());
        System.out.println(arrayListClass.getCanonicalName());
        System.out.println(employeeClass.getCanonicalName());
        System.out.println(floatClass.getCanonicalName());
        System.out.println();

        System.out.println("getName");
        System.out.println(playerClass.getName());
        System.out.println(arrayClass.getName());
        System.out.println(arrayListClass.getName());
        System.out.println(employeeClass.getName());
        System.out.println(floatClass.getName());
        System.out.println();

        System.out.println("getSimpleName");
        System.out.println(playerClass.getSimpleName());
        System.out.println(arrayClass.getSimpleName());
        System.out.println(arrayListClass.getSimpleName());
        System.out.println(employeeClass.getSimpleName());
        System.out.println(floatClass.getSimpleName());
        System.out.println();

        System.out.println("getTypeName");
        System.out.println(playerClass.getTypeName());
        System.out.println(arrayClass.getTypeName());
        System.out.println(arrayListClass.getTypeName());
        System.out.println(employeeClass.getTypeName());
        System.out.println(floatClass.getTypeName());
        System.out.println();

        System.out.println("toGenericString");
        System.out.println(playerClass.toGenericString());
        System.out.println(arrayClass.toGenericString());
        System.out.println(arrayListClass.toGenericString());
        System.out.println(employeeClass.toGenericString());
        System.out.println(floatClass.toGenericString());
        System.out.println();

        System.out.println("toString");
        System.out.println(playerClass.toString());
        System.out.println(arrayClass.toString());
        System.out.println(arrayListClass.toString());
        System.out.println(employeeClass.toString());
        System.out.println(floatClass.toString());
    }
}
