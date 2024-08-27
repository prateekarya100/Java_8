package Java8.FunctionalInterface.UnaryOperator_Interface;

import Java8.FunctionInterfaceExample.Employee;
import Java8.FunctionInterfaceExample.EmployeeDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorRealTimeExample {
    static UnaryOperator<List<Employee>> listUnaryOperator=(employees ->{
        List<Employee> employeeList=new ArrayList<>();
        employees.forEach(employee -> {
            if (employee.getDesignation().contains("quality tester")){
                employeeList.add(employee);
            }
        });
        return employeeList;
    });
    public static void main(String[] args) {
        System.out.print(listUnaryOperator.apply(EmployeeDatabase.getEmployees()));
    }
}
