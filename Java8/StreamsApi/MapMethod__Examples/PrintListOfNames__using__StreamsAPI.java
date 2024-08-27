package Java8.StreamsApi.MapMethod__Examples;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class PrintListOfNames__using__StreamsAPI {
    static List<Student> studentList= StudentDatabase.getAllStudents();

    public static void main(String[] args) {
        System.out.println(printNames__usingStreams__Map());
//        System.out.println(print__ListOf__Activities());
    }

    private static List<String> printNames__usingStreams__Map() {
        return studentList.stream()
                .map(Student::getName)
//                .map(String::toUpperCase)
                .collect(toList());
//        return studentList.stream()
//                .map(Student::getActivities)
//                .collect(toList());
    }
}
