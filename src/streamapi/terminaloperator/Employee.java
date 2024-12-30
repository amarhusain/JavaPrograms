package streamapi.terminaloperator;

public class Employee {

    private String name;
    private String department;
    private double salary;
    private String mobile;

    // Constructor
    public Employee(String name, String department, double salary, String mobile) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.mobile = mobile;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getMobile() {
        return mobile;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", mobile='" + mobile + '\'' +
                '}';
    }


}
