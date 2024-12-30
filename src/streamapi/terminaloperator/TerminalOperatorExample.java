package streamapi.terminaloperator;

import java.util.*;
import java.util.stream.Collectors;

public class TerminalOperatorExample {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 50000, "1234567890"),
                new Employee("Bob", "IT", 70000, "2345678901"),
                new Employee("Charlie", "HR", 60000, "3456789012"),
                new Employee("David", "Finance", 80000, "4567890123")
        );


        System.out.println("====================== reduce ====================");

        double totalSalary = employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);

        System.out.println("Total Salary: " + totalSalary);

        System.out.println("====================== groupingBy ====================");
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(employeesByDepartment);

        System.out.println("====================== count ====================");
        long hrCount = employees.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase("HR"))
                .count();

        System.out.println("Number of HR Employees: " + hrCount);

        System.out.println("====================== anyMatch ====================");
        boolean hasHighEarner = employees.stream()
                .anyMatch(emp -> emp.getSalary() > 75000);

        System.out.println("Is there any employee earning above 75k? " + hasHighEarner);


        System.out.println("====================== allMatch ====================");
        boolean allAbove40k = employees.stream()
                .allMatch(emp -> emp.getSalary() > 40000);

        System.out.println("Do all employees earn above 40k? " + allAbove40k);

        System.out.println("====================== noneMatch ====================");
        boolean noSales = employees.stream()
                .noneMatch(emp -> emp.getDepartment().equalsIgnoreCase("Sales"));

        System.out.println("Are there no employees in the Sales department? " + noSales);

        System.out.println("====================== findFirst ====================");
        Optional<Employee> firstEmployee = employees.stream().findFirst();
        firstEmployee.ifPresent(System.out::println);

        System.out.println("====================== findAny ====================");
        Optional<Employee> anyEmployee = employees.stream().findAny();
        anyEmployee.ifPresent(System.out::println);

        System.out.println("====================== min ====================");
        Optional<Employee> minSalaryEmp = employees.stream()
                .min(Comparator.comparing(Employee::getSalary));

        minSalaryEmp.ifPresent(emp -> System.out.println("Employee with Minimum Salary: " + emp));

        System.out.println("====================== max ====================");
        Optional<Employee> maxSalaryEmp = employees.stream()
                .max(Comparator.comparing(Employee::getSalary));

        maxSalaryEmp.ifPresent(emp -> System.out.println("Employee with Maximum Salary: " + emp));

        System.out.println("====================== partitioningBy salary====================");
        Map<Boolean, List<Employee>> partitionedBySalary = employees.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getSalary() > 60000));

        System.out.println("Employees earning more than 60,000: ");
        partitionedBySalary.get(true).forEach(System.out::println);

        System.out.println("\nEmployees earning 60,000 or less: ");
        partitionedBySalary.get(false).forEach(System.out::println);

        System.out.println("====================== partitioningBy department====================");
        Map<Boolean, List<Employee>> partitionedByDepartment = employees.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getDepartment().equalsIgnoreCase("IT")));

        System.out.println("Employees in IT Department: ");
        partitionedByDepartment.get(true).forEach(System.out::println);

        System.out.println("\nEmployees not in IT Department: ");
        partitionedByDepartment.get(false).forEach(System.out::println);



    }
}
