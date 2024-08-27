package Java8.StreamsApi.MapMethod__Examples;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsAPI__FlatMapExample {
    static List<Student> studentList= StudentDatabase.getAllStudents();
    public static void main(String[] args) {
//        System.out.println(print__Name_Of_Students_using_FlatMap());
//        System.out.println(flatNumbers());
//        System.out.println(Flat_student_activities());
//        System.out.println(flat__English__Alphabets());
//        System.out.println("Count__No_of_Activities_of_Student :: "+Count__No_of_Activities_of_Student());
        System.out.println("Distinct_Activities_of_Student :: "+Distinct_Activities_of_Student());
        System.out.println("Sorted__Distinct_Activities_of_Student :: "+Sorted__Distinct_Activities_of_Student());
//        System.out.println("Count_No_of_Distinct_Activities_of_Student :: "+Count_Distinct_Activities_of_Student());
    }

    private static List<String> Sorted__Distinct_Activities_of_Student() {
        return studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
    }

    private static long Count_Distinct_Activities_of_Student() {
        return studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct().count();
    }

    private static List<String> Distinct_Activities_of_Student() {
        return studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(toList());
    }

    private static long Count__No_of_Activities_of_Student() {
        return studentList.stream()
                .map(Student::getActivities)
                .count();
    }

    private static List<String> flat__English__Alphabets() {
        List<List<String>> alphabetsSet = new ArrayList<>();
        alphabetsSet.add(Arrays.asList("t","u"));
        alphabetsSet.add(Arrays.asList("v","w","x"));
        alphabetsSet.add(Arrays.asList("y","z"));

        System.out.println(alphabetsSet);
        return alphabetsSet.stream()
                .flatMap(Collection::stream)
                .collect(toList());
    }

    private static List<String> Flat_student_activities() {
        return studentList.stream().map(Student::getActivities).flatMap(Collection::stream)
                .collect(toList());
    }

    private static boolean flatNumbers() {
        List<List<Integer>> integerList=new ArrayList<>();
        integerList.add(Arrays.asList(1,2,3));
        integerList.add(Arrays.asList(4,5,6));
        integerList.add(Arrays.asList(7,8,9));
        System.out.println(integerList);
        List<Integer> numbers= integerList.stream()
                .flatMap(integers -> integers.stream())
                .collect(toList());
        System.out.println(numbers);
        return true;
    }

    private static List<String> print__Name_Of_Students_using_FlatMap() {
        return studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(toList());
    }
}
