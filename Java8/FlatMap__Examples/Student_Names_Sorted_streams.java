package Java8.FlatMap__Examples;

import Java8.StreamsApi.data.Student;
import Java8.StreamsApi.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class Student_Names_Sorted_streams {
    static List<Java8.StreamsApi.data.Student> studentList= StudentDatabase.getAllStudents();
    static Predicate<Java8.StreamsApi.data.Student> predicate1=(student -> student.getGender().equals("male"));

    public static void main(String[] args) {
//        sorting students by their names
//        sort_students_by_names().forEach(System.out::println);

//        print only female students_names
//        print_names_of_only_female_students().forEach(System.out::println);

//        print name of student whose name starts with prat and loves programming
//        name_starts_with_PRAT_and_loves_Programming().forEach(System.out::println);

//       find a student whose surname is makrariya?
//        print_student_by_surname().forEach(System.out::println);

//        count students who love programming?
//        System.out.println("total_student_who_loves_programming :: "+count_students_who_loves_programming());

//      sort students as per their activities in alphabetical order
        sort_students_by_gradeLevel_order().forEach(System.out::println);
//
    }

    static Predicate<Student> predicate4=student -> student.getGradeLevel()>5.5;
    static Predicate<Student> predicate5=student -> student.getName().startsWith("varn");
    private static List<Student> sort_students_by_gradeLevel_order() {
        return studentList.stream()
                .filter(predicate4.or(predicate5))
                .collect(toList());
    }

    private static long count_students_who_loves_programming() {
        return studentList.stream()
                .filter(predicate3)
                .count();
    }

    static Predicate<Student> filtered_by_surname=(student -> student.getName().endsWith("makrariya"));
    private static List<Student> print_student_by_surname() {
        return studentList.stream()
                .filter(filtered_by_surname)
                .collect(toList());
    }

    static Predicate<Student> predicate2=(student -> student.getName().startsWith("prat"));
    static Predicate<Student> predicate3=(student -> student.getActivities().contains("programming"));
    private static List<Student> name_starts_with_PRAT_and_loves_Programming() {
        return studentList.stream()
                .filter(predicate2)
                .filter(predicate3)
                .collect(toList());
    }

    private static List<Student> print_names_of_only_female_students() {
        return studentList.stream()
                .filter(predicate1)
                .collect(toList());
    }

    private static List<Java8.StreamsApi.data.Student> sort_students_by_names() {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }
}
