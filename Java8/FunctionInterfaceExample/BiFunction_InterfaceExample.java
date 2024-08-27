package Java8.FunctionInterfaceExample;

import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunction_InterfaceExample {
    static Predicate<Employee> predicate=(salary)->salary.getSalary()<20000;
    static BiFunction<List<Employee>,Predicate<Employee>, HashMap<String,Double>> biFunction=((employees, predicatePass) -> {
        HashMap<String,Double> hashMap=new HashMap<>();
           employees.forEach(employee -> {
               if (predicatePass.test(employee)){
                   hashMap.put(employee.getName(), employee.getSalary());
               }
           });
        return hashMap;
    });

    public static void main(String[] args) {
        System.out.println(biFunction.apply(EmployeeDatabase.getEmployees(),FunctionInterfaceExample.predicate1));
    }
}
