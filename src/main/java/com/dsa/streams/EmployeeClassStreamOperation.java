package com.dsa.streams;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeClassStreamOperation {

    public static void main(String[] args) {

        List<Employee> employee = Arrays.asList(

                new Employee(1,"John","IT","Delhi",80000,30),
                new Employee(2,"Alex","HR","Mumbai",60000,28),
                new Employee(3,"Mike","IT","Delhi",95000,35),
                new Employee(4,"David","Finance","Pune",70000,32),
                new Employee(5,"Sam","HR","Mumbai",65000,27),
                new Employee(6,"Chris","Finance","Delhi",85000,40),
                new Employee(7,"Tom","IT","Bangalore",120000,38)
        );

        System.out.println("Find Employees from IT department");

        List<Employee> ListOfEmployeesFromItDept = employee.stream().filter(emp -> emp.getDepartment().equals("IT")).toList();

        ListOfEmployeesFromItDept.forEach(emp -> System.out.println(emp.getName()));

        System.out.println("Find Employee from Delhi");

        List<Employee> employeeFromDelhi = employee.stream().filter(emp -> emp.getCity().equals("Delhi")).toList();

        employeeFromDelhi.forEach(emp -> System.out.println(emp.getName()));

        System.out.println("Find employees with salary greater then 80000");

        List<Employee> employeeSalaryGreaterThen80K = employee.stream().filter(emp -> emp.getSalary() > 80000).toList();

        employeeSalaryGreaterThen80K.forEach( emp -> System.out.println(emp.getName()+", "+ emp.getSalary()));

        System.out.println("Average salary by each department : ");

        Map<String, Double> averageSalarybyDept = employee.stream().collect(Collectors.groupingBy(Employee :: getDepartment,Collectors.averagingDouble(Employee :: getSalary)));

        System.out.println(averageSalarybyDept);

        System.out.println("Find highest salary");

        Employee highestSalary = employee.stream().max(Comparator.comparing(Employee :: getSalary)).orElse(null);

        System.out.println(highestSalary.getName() +", "+ highestSalary.getSalary());

        System.out.println("Highest salary per department");

        Map<String, Employee> highestSalaryMap = employee.stream().collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee :: getSalary)), Optional :: get)));

        highestSalaryMap.forEach((dept, emp) -> System.out.println(dept+", "+ emp.getSalary()));

        System.out.println("Second highest salary");

        Employee secondHighestSalary = employee.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed()).skip(1).findFirst().orElse(null);

        System.out.println(secondHighestSalary.getName() + ", " + secondHighestSalary.getSalary());

    }
}

class Employee {

    private int id;
    private String name;
    private String department;
    private String city;
    private double salary;
    private int age;

    Employee(int id, String name, String department, String city, double salary, int age){
        this.id = id;
        this.name = name;
        this.department = department;
        this.city = city;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getCity() {
        return city;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

}
