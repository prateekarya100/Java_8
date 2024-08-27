package Java8.FlatMap__Examples;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNames__of_students {

    public static void main(String[] args) {
//        System.out.println(StudentDatabase.getAllStudents().stream()
//                .map(Student::getName)
//                .sorted()
//                .collect(Collectors.toList()));

//        System.out.println(students_sorted_by_name());
//        System.out.println(students_sorted_by_gpa());
//        System.out.println(students_sorted_by_gpa_descending());
    }

    private static List<Student> students_sorted_by_gpa_descending() {
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    private static List<Student> students_sorted_by_gpa() {
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    private static List<Student> students_sorted_by_name() {
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
}
