package Java8.FunctionalInterface.Supplier_Interface;


import Java_8_sampleData.Student;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExamples {
//    supplier is used to just supply objects
    static Supplier<Student> supplier=()->{
        return new Student("prateek arya",2,6.9D, Arrays.asList("music","football","overthinking"));
    };

    public static void main(String[] args) {
        System.out.println(supplier.get());
    }
//---------------- SUPPLY REAL TIME DATA FROM DATABASE ----------------------------------------

//    static Supplier<List<Student>> listSupplier=()->{
//        return StudentDatabase.getAllStudents();
//    };
//    public static void main(String[] args) {
//        System.out.println(listSupplier.get());
//    }
}
