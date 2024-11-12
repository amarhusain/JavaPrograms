package collections.comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {
  public static void main(String[] args) {

    ArrayList<Employee> list = new ArrayList<>();

    list.add(new Employee(22L, "Haider", LocalDate.of(1992, 7, 15)));
    list.add(new Employee(18L, "Amar", LocalDate.of(2003, 4, 23)));
    list.add(new Employee(30L, "Tahir", LocalDate.of(1999, 11, 26)));
    list.add(new Employee(600L, "Sajjad", LocalDate.of(2013, 2, 16)));
    list.add(new Employee(5L, "Mohammad", LocalDate.of(1997, 8, 24)));

    //Custom order
    Collections.sort(list, new NameSorter());
    System.out.println(list);

    //Order by name
    list.sort(Comparator.comparing(Employee::getName));
    System.out.println(list);

    //Order by name in reverse order
    list.sort(Comparator.comparing(Employee::getName).reversed());
    System.out.println(list);

    //Order by id field
    list.sort(Comparator.comparing(Employee::getId));
    System.out.println(list);

    //Order by employee age
    list.sort(Comparator.comparing(Employee::getDob).reversed());
    System.out.println(list);

  }

}
