package Java8.FlatMap__Examples;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlatMap__Distinct__Count__Sorted_Examples {
    static List<Student> studentList= StudentDatabase.getAllStudents();
    public static void main(String[] args) {
//        System.out.println(print__student_activities_using_flatMap());
//        System.out.println(sort_student_activities());
//        System.out.println(unique__student_activities());
//        System.out.println(unique__and__sorted_student_activities());
//        System.out.println("count__noOf_activities_exists :: "+count__noOf_activities_exists());
    }

    private static long count__noOf_activities_exists() {
        return studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .count();
    }

    private static List<String> unique__and__sorted_student_activities() {
        return studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .sorted().distinct().collect(toList());
    }

    private static List<String > unique__student_activities() {
        return studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct().collect(toList());
    }

    private static List<String> sort_student_activities() {
        return studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .sorted()
                .collect(toList());
    }

    private static List<String> print__student_activities_using_flatMap() {
        return studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(toList());
    }
}
