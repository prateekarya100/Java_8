package Java8.FlatMap__Examples;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Function_Interface_Example {
    static Predicate<Student> predicate1=(student -> student.getGpa()>=4);
    static Function<List<Student>, HashMap<String,List<String>>> hashMapFunction=(students)->{
        HashMap<String,List<String>> map=new HashMap<>();
        students.forEach(student -> {
            if (predicate1.test(student)){
                map.put(student.getName(),student.getActivities());
            }
        });
        return map;
    };
    public static void main(String[] args) {
        System.out.println(hashMapFunction.apply(StudentDatabase.getAllStudents()));
    }
}
