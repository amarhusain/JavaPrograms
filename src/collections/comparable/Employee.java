package collections.comparable;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {

  private Long id;
  private String name;
  private LocalDate dob;

  public Employee(Long id, String name, LocalDate dob) {
    this.id = id;
    this.name = name;
    this.dob = dob;
  }

  @Override
  public int compareTo(Employee o)
  {
    return this.getId().compareTo( o.getId() );
  }

  public Long getId() {
    return id;
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
