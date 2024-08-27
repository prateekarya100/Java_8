package Java8.FunctionalInterface.Predicate_Interface;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class FunctionInterface_RealTimeHashMap {
    static Function<List<Student>, HashMap<String,Double>> hashMapFunction=(students -> {
        HashMap<String,Double> hashMap=new HashMap<>();
        students.forEach(student -> {
            if (PredicateRealTimeExamples.predicate4.test(student)){
                hashMap.put(student.getName(),student.getGradeLevel());
            }
        });
        return hashMap;
    });
    public static void main(String[] args) {
        System.out.println(hashMapFunction.apply(StudentDatabase.getAllStudents()));
    }
}
