package Java8.StreamsApi.FilterMethod__Examples;

import Java8.StreamsApi.data.Student;
import Java8.StreamsApi.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class Filter_students_gpa_lessThan5 {
    static List<Student> studentList= StudentDatabase.getAllStudents();
    public static void main(String[] args) {
        students_whose_gpa_less_than_5().forEach(System.out::println);
    }
    static Predicate<Student> predicate1=(student -> student.getGpa()<5);
    static Predicate<Student> predicate2=(student -> student.getGradeLevel()<5.5);
    private static List<Student> students_whose_gpa_less_than_5() {
        return studentList.stream()
                .filter(predicate1)
                .filter(predicate2)
                .collect(toList());
    }
}
