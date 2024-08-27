package Java8.StreamsApi.Reduce_Method.EmployeeUseCase.UseCase1;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class calculate_total_no_of_books {
    public static void main(String[] args) {
//        System.out.println("total_books_allocated_to_students_from_library :: "+total_books_allocated_to_students_from_library().get());

//        find total no of books allocated to students whose gender is male
//        System.out.println("total_books_allocated_to_male_students :: "+total_books_allocated_to_male_students().get());
//        System.out.println("total_books_allocated_to_female_students :: "+total_books_allocated_to_female_students().get());

//        books_allocated_to_students_whose_gpa_more_than4()
//                .forEach(System.out::println);

//
        System.out.println("count_total_books_allocated_to_students :: "
                +count_total_books_allocated_to_students().get());
//
        books_allocated_to_female_students_whose_gpa_less_than4()
                .forEach(System.out::println);

        System.out.println("count_books_allocated_to_female_students_whose_gpa_less_than4 :: "
                +count_books_allocated_to_female_students_whose_gpa_less_than4().get());
    }

    private static Optional<Integer> count_books_allocated_to_female_students_whose_gpa_less_than4() {
        return Students_Library_BooksDatabase.getAll_AllocatedBooks().stream()
                .filter(predicate5)
                .filter(predicate4)
                .map(Student::getNoOfBooks)
                .reduce(Integer::sum);
    }

    private static Optional<Integer> count_total_books_allocated_to_female_students_whose_gpa_more_than4() {
        return Students_Library_BooksDatabase.getAll_AllocatedBooks().stream()
                .filter(predicate4)
                .filter(predicate5)
                .map(Student::getNoOfBooks)
                .reduce(Integer::sum);
    }

    static Predicate<Student> predicate4=(student -> student.getGpa()<4);
    static Predicate<Student> predicate5=(student -> student.getGender().equals("female"));
//    private static List<Student> count_total_books_allocated_to_female_students_whose_gpa_less_than4() {
//        return Students_Library_BooksDatabase.getAll_AllocatedBooks().stream()
//                .filter(predicate4)
//                .filter(predicate5)
//                .collect(Collectors.toList());
//    }

    static Predicate<Student> predicate3=(student -> student.getGpa()<4);
    private static List<Student> books_allocated_to_female_students_whose_gpa_less_than4() {
        return Students_Library_BooksDatabase.getAll_AllocatedBooks().stream()
                .filter(predicate3)
                .filter(predicate5)
                .collect(toList());
    }

    static Predicate<Student> predicate2=(student -> student.getGender().equals("female"));
    private static Optional<Integer> total_books_allocated_to_female_students() {
        return Students_Library_BooksDatabase.getAll_AllocatedBooks().stream()
                .filter(predicate2)
                .map(Student::getNoOfBooks)
                .reduce(Integer::sum);
    }

    static Predicate<Student> predicate1=(student -> student.getGender().equals("male"));
    private static Optional<Integer> total_books_allocated_to_male_students() {
        return Students_Library_BooksDatabase.getAll_AllocatedBooks().stream()
                .filter(predicate1)
                .map(Student::getNoOfBooks)
                .reduce(Integer::sum);
    }

    private static Optional<Integer> count_total_books_allocated_to_students() {
        return Students_Library_BooksDatabase.getAll_AllocatedBooks().stream()
                .map(Student::getNoOfBooks)
//                .reduce((book1,book2)->book1+book2);
                .reduce(Integer::sum);
    }
}
