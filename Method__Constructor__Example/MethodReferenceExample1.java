package Method__Constructor__Example;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.function.Consumer;

public class MethodReferenceExample1 {
//    static Consumer<Student> consumer= name-> System.out.println(name.getName().toUpperCase());
    static Consumer<Student> consumer=Student::printListOfActivities;
    static Consumer<Student> consumer2=System.out::println;
    static Consumer<Student> consumer3=Student::printNameOfStudent;
    public static void main(String[] args) {
        consumer.accept(StudentDatabase.studentSupplier.get());
        consumer2.accept(StudentDatabase.studentSupplier.get());
        consumer3.accept(StudentDatabase.studentSupplier.get());
    }
}
