package Java8.StreamsApi.Reduce_Method;

import Java8.StreamsApi.Reduce_Method.EmployeeUseCase.Employee;
import Java8.StreamsApi.Reduce_Method.EmployeeUseCase.EmployeeDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Max_using_reduce {
    static List<Employee> employeeList= EmployeeDatabase.getEmployees();
    public static void main(String[] args) {
//            find employee who are getting maximum salary
        System.out.println(max_function_without_reduce());
        System.out.println(max_function_using_reduce());
    }

    private static Optional<Employee> max_function_using_reduce() {
        return employeeList.stream()
                .reduce((a,b)->a.getSalary() > b.getSalary() ? a : b);
    }

    private static Optional<Employee> max_function_without_reduce() {
        return Optional.of(employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .get());

//        we can check max/min by using reduce method also
//                .reduce((x,y)-> x.getSalary() < y.getSalary() ? x : y);
    }
}
