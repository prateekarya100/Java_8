package Java8.FunctionalInterface.Predicate_Interface;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class FunctionMap_NameAndGPA {
    static Function<List<Student>, HashMap<String,Integer>> hashMapFunction=(students -> {
       HashMap<String,Integer> hashMap=new HashMap<>();
       students.forEach(student -> {
           if (PredicateRealTimeExamples.predicate1.test(student)){
                hashMap.put(student.getName(), student.getGpa());
           }
       });
       return hashMap;
    });
    public static void main(String[] args) {
        System.out.println(hashMapFunction.apply(StudentDatabase.getAllStudents()));
    }
}
