package Java8.StreamsApi.Reduce_Method.EmployeeUseCase;

import java.util.List;
import java.util.Optional;

public class Total_cost_company_spend_on_their_employees_salary {

    static List<Employee> employeeList=EmployeeDatabase.getEmployees();
    public static void main(String[] args) {
        System.out.println(total_cost_to_company().get());
    }

    private static Optional<Double> total_cost_to_company() {
        return EmployeeDatabase.getEmployees().stream()
                .map(Employee::getSalary)
                .reduce((employee, employee2) -> employee.doubleValue()+employee2.doubleValue());
    }
}
