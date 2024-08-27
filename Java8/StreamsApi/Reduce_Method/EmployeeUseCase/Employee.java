package Java8.StreamsApi.Reduce_Method.EmployeeUseCase;

public class Employee {
    private String name;
    private String designation;
    private String location;
    private double salary;

    public Employee(String name, String designation, String location, double salary) {
        this.name = name;
        this.designation = designation;
        this.location = location;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
