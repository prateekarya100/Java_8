package Java8.StreamsApi.AllMatch_AnyMatch_NoneMatch;

import Java8.StreamsApi.Reduce_Method.EmployeeUseCase.Employee;
import Java8.StreamsApi.Reduce_Method.EmployeeUseCase.EmployeeDatabase;

import java.util.List;
import java.util.function.Predicate;

public class AllMatch_AnyMatch_NoneMatch_Examples {
    static List<Employee> employeeList= EmployeeDatabase.getEmployees();
    public static void main(String[] args) {
//        print all employees if they belong to noida location
//        if (all_match_employees_from_noida_location()){
//            employeeList.forEach(System.out::println);
//        }

//        print employees who are [programmer analyst trainee], if anyone is matched with database stream
//        if (anyMatched_employees_designation_as_pat()){
//            employeeList.forEach(System.out::println);
//        }else {
//            System.out.println("Not a single PAT is found?");
//        }

//        print all employees if none or not a single employee location as pune
        if (none_match_location_pune()){
            employeeList.forEach(System.out::println);
        }
    }

    static Predicate<Employee> pune=employee -> employee.getLocation().equals("pune");
    private static boolean none_match_location_pune() {
        return employeeList.stream()
                .noneMatch(pune);
    }

    static Predicate<Employee> patDesignation=employee ->
            employee.getDesignation().equals("programmer analyst trainee");
    private static boolean anyMatched_employees_designation_as_pat() {
        return employeeList.stream()
                .anyMatch(patDesignation);
    }

    static Predicate<Employee> locationNoida=(employee -> employee.getLocation().equals("noida"));
    private static boolean all_match_employees_from_noida_location() {
        return employeeList.stream().allMatch(locationNoida);
    }
}
