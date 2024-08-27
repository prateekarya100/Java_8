package Java8.StreamsApi.Reduce_Method.EmployeeUseCase;

import java.util.List;

public class Reduce_Employee_with_highest_salary {

    static List<Employee> employeeList=EmployeeDatabase.getEmployees();
    public static void main(String[] args) {
        System.out.println(employeeList.stream()
                .reduce((employee1, employee2) ->employee1.getSalary() > employee2.getSalary() ?employee1 :employee2).get());


    }
}
