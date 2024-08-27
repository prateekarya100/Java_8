package Java8.StreamsApi.MapMethod__Examples;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams__API__MapFunction {
    static Predicate<Student> predicate1=(student -> student.getGpa()>=5);
    static Predicate<Student> predicate2=(student -> student.getActivities().contains("guitar"));
    static List<Student> studentList= StudentDatabase.getAllStudents();
    public static void main(String[] args) {
        Map<String,List<String>> stringListMap = studentList.stream()
                .filter(predicate1)
                .filter(predicate2)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(stringListMap);
    }
}
