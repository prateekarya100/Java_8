package Java8.FunctionInterfaceExample;

import java.util.HashMap;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

// print name and designation of employees whose salary>=30000

public class FunctionInterfaceExample {
    static Predicate<Employee> predicate1=(salary)->salary.getSalary()<=30000;
//    static Predicate<Employee> predicate2=(project)-> Boolean.parseBoolean(String.valueOf(project.getProject().contains("broadridge")));
    static BiPredicate<Double,String> biPredicate=(salary,project)->salary>=30000 && project.contains("goldman sachs");
    static Function<List<Employee>, HashMap<String,Double>> hashMapFunction=(employees -> {
        HashMap<String,Double> hashMap=new HashMap<>();
        employees.forEach(employee -> {
            if (biPredicate.test(employee.getSalary(), employee.getProject())){
                hashMap.put(employee.getName(), employee.getSalary());
            }
//            if (predicate1.and(predicate2).test(employee)){
//                hashMap.put(employee.getName(),employee.getSalary());
//            }
        });
        return hashMap;
    });
    public static void main(String[] args) {
        System.out.println(hashMapFunction.apply(EmployeeDatabase.getEmployees()));
    }
}
