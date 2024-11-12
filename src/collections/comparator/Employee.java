package collections.comparator;

import java.time.LocalDate;
import lombok.Data;


public class Employee {

  private Long id;
  private String name;
  private LocalDate dob;

  public Employee(Long id, String name, LocalDate dob) {
    this.id = id;
    this.name = name;
    this.dob = dob;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public LocalDate getDob() {
    return dob;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", dob=" + dob +
        '}';
  }
}
