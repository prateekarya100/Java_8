package Java8.FunctionInterfaceExample;

import java.util.List;

public class Employee {
    private String name;
    private String designation;
    private String project;
    private Double salary;
    private List<String> technologies;

    public Employee(String name, String designation, String project, Double salary, List<String> technologies) {
        this.name = name;
        this.designation = designation;
        this.project = project;
        this.salary = salary;
        this.technologies = technologies;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", project='" + project + '\'' +
                ", salary=" + salary +
                ", technologies=" + technologies +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }
}
