package streamapi.groupingby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "HR"),
                new Employee("David", "IT"),
                new Employee("Eve", "Finance")
        );

        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.department));

        employeesByDepartment.forEach((dept, empList) ->
                System.out.println(dept + ": " + empList)
        );
    }
}
