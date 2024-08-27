package Function__Interface;

import Java8__StudentDatabase.Student;
import Java8__StudentDatabase.StudentDatabase;

import java.util.function.Predicate;

public class RefactorMethod_Reference {
//    static Predicate<Student> predicate=(student -> student.getGpa()>4);
//    static Consumer<Student> consumer=(System.out::println);

//------------------------- REFACTORED METHOD REFERENCE --------------------------
    static Predicate<Student> predicate=RefactorMethod_Reference::greaterThanGpa4;
    public static boolean greaterThanGpa4(Student student){
        return student.getGpa()>4;
    }
    public static void main(String[] args) {
        System.out.println(predicate.test(StudentDatabase.studentSupplier.get()));
    }
}
