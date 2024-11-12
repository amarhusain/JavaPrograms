package collections.comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
  public static void main(String[] args) {

    ArrayList<Employee> list = new ArrayList<>();

    list.add(new Employee(22L, "Lokesh", LocalDate.now()));
    list.add(new Employee(18L, "Alex", LocalDate.now()));
    list.add(new Employee(30L, "Bob", LocalDate.now()));
    list.add(new Employee(600L, "Charles", LocalDate.now()));
    list.add(new Employee(5L, "David", LocalDate.now()));

    //Natural order
    Collections.sort(list);
    System.out.println(list);

    //Sort in reverse natural order
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);

    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);

    list.stream()
        .sorted()
        .forEach(i -> System.out.println(i));

  }

}
