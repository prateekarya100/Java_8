package Function__Interface;

import Java8__StudentDatabase.Student;
import Java8__StudentDatabase.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Function__Interface__RealTimeExample {
    static Predicate<Student> predicate=(student -> student.getGpa()>=4);
    static Function<List<Student>, HashMap<String,List<String>>> function=(students -> {
        HashMap<String,List<String>> hashMap=new HashMap<>();
        students.forEach(student -> {
            if (predicate.test(student)){
                System.out.println(student.getName()+" "+student.getHobbies());
            }
        });
        return hashMap;
    });
    public static void main(String[] args) {
        List<Student> studentList= StudentDatabase.getAllStudents();
        function.apply(studentList);
    }
}
