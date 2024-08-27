package Consumer__Interface;

import Java8__StudentDatabase.Student;
import Java8__StudentDatabase.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Consumer__RealTimeExample {
    static Predicate<Student> predicate=(student -> student.getHobbies().contains("running"));
    static List<Student> studentList= StudentDatabase.getAllStudents();
    static Consumer<Student> consumer=(student -> {
        if (predicate.test(student)){
            System.out.println(student);
        }
    });
    public static void main(String[] args) {
        studentList.forEach(consumer);
    }
}
