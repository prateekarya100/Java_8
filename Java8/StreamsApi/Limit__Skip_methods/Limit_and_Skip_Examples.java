package Java8.StreamsApi.Limit__Skip_methods;

import Java8.StreamsApi.Reduce_Method.EmployeeUseCase.Employee;
import Java8.StreamsApi.Reduce_Method.EmployeeUseCase.EmployeeDatabase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Limit_and_Skip_Examples {
    static List<Employee> employeeList= EmployeeDatabase.getEmployees();
    public static void main(String[] args) {
//        produce only 3 employees data from database
//        limit_employee_result().forEach(System.out::println);

//        skip 2 employees record from database stream
        skip_two_employees_from_stream().forEach(System.out::println);
    }

    private static List<Employee> skip_two_employees_from_stream() {
        return employeeList.stream()
                .skip(2)
                .collect(toList());
    }

    private static List<Employee> limit_employee_result() {
        return employeeList.stream()
                .limit(3)
                .collect(toList());
    }
}
