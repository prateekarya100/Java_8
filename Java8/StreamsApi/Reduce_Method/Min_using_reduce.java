package Java8.StreamsApi.Reduce_Method;

import Java8.StreamsApi.Reduce_Method.EmployeeUseCase.Employee;
import Java8.StreamsApi.Reduce_Method.EmployeeUseCase.EmployeeDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Min_using_reduce {
    static List<Employee> employeeList= EmployeeDatabase.getEmployees();

    public static void main(String[] args) {
        System.out.println(employee_having_minimum_salary_without_reduce().get());
        System.out.println(employee_having_minimum_salary_with_reduce().get());
    }

    private static Optional<Employee> employee_having_minimum_salary_with_reduce() {
        return employeeList.stream()
                .reduce((a,b)->a.getSalary() < b.getSalary() ? a : b);
    }

    private static Optional<Employee> employee_having_minimum_salary_without_reduce() {
        return employeeList.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));
    }
}
