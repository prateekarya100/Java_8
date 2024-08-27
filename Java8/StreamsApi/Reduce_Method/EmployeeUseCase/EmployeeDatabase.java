package Java8.StreamsApi.Reduce_Method.EmployeeUseCase;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {
    public static List<Employee> getEmployees(){
        return Arrays.asList(
          new Employee("prateek arya","programmer analyst","noida",30462),
          new Employee("aman singhal","programmer analyst trainee","noida",33462),
          new Employee("vikas kumar","programmer analyst","noida",36462),
          new Employee("shivangi upadhyay","programmer analyst","noida",36662),
          new Employee("varnita makrariya","programmer analyst trainee","noida",26462)
        );
    }
}
