package Java8.StreamsApi.FilterMethod__Examples;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class filter_name_whose_gpa_greater_than_equalTo_3 {
    static List<Student> studentList= StudentDatabase.getAllStudents();
    static Predicate<Student> predicate1=(student -> student.getGpa()>=4);
    static Predicate<Student> predicate2=(student -> student.getGpa()<=3);
    static Predicate<Student> predicate3=(student -> student.getActivities().contains("guitar"));

    public static void main(String[] args) {
//        System.out.println(name_whose_gpa_greater_than_equalTo_4());
        System.out.println(name_of_student_who_loves_to_play_guitar());
    }

    private static List<Student> name_of_student_who_loves_to_play_guitar() {
        return studentList.stream()
//                .filter(predicate2)
                .filter(predicate3)
                .collect(Collectors.toList());
    }

    private static List<Student> name_whose_gpa_greater_than_equalTo_4() {
        return studentList.stream()
                .filter(predicate1)
                .collect(Collectors.toList());
    }
}
