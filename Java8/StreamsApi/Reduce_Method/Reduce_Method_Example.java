package Java8.StreamsApi.Reduce_Method;

import Java8.StreamsApi.data.Student;
import Java8.StreamsApi.data.StudentDatabase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Reduce_Method_Example {
    static List<Integer> integers= Arrays.asList(4,3,5,2,1);

    public static void main(String[] args) {
//        System.out.println(calculate_total_of_all_integers());
//        System.out.println(calculate_multiplication_of_all_integers_with_identity());
//        System.out.println(calculate_multiplication_of_all_integers_without_identity().get());
//            System.out.println(student_with_highest_gpa().get());
        System.out.println(student_with_highest_gpa_by_using_reduce().get());
    }

//  find student_with_highest_gpa_by_using_reduce
    private static Optional<Student> student_with_highest_gpa_by_using_reduce() {
        return StudentDatabase.getAllStudents().stream()
                .reduce((student, student2) -> student.getGpa()>student2.getGpa() ? student:student2);
    }

    private static Optional<Student> student_with_highest_gpa() {
        return StudentDatabase.getAllStudents().stream()
                .max(Comparator.comparingInt(Student::getGpa));
    }
    private static Optional<Integer> calculate_multiplication_of_all_integers_without_identity() {
        return integers.stream()
                .reduce((a,b)->a*b);
    }

    private static int calculate_multiplication_of_all_integers_with_identity() {
        return integers.stream()
                .reduce(1,(a,b)->a*b);
    }

    private static int calculate_total_of_all_integers() {
        return integers.stream()
                .reduce(0,(a,b)->a+b);
    }
}
