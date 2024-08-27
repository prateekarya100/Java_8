package Java8.FunctionInterfaceExample;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {
    public static List<Employee> getEmployees(){
        return Arrays.asList(
          new Employee("prateek arya","programmer analyst","goldman sachs",30462.0,Arrays.asList("java","springboot","microservices","docker","spring security")),
          new Employee("varnita makrariya","programmer analyst","iot io projects",26562.0,Arrays.asList("java","springboot","docker","spring security")),
          new Employee("ravina yadav","quality tester","enthyne labs",6462.0,Arrays.asList("java","springboot","microservices","spring security")),
          new Employee("kunal singhal","devops","goldman sachs",36462.0,Arrays.asList("java","springboot","docker","spring security")),
          new Employee("kavita singh","data analyst","broadridge",53462.0,Arrays.asList("java","springboot","microservices","docker","spring security")),
          new Employee("rahul singh","quality tester","pepsico",66462.0,Arrays.asList("java","springboot","spring security"))
        );
    }
}
