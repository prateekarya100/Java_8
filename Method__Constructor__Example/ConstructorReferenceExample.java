package Method__Constructor__Example;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.function.Consumer;
import java.util.function.Function;

public class ConstructorReferenceExample {
    static Function<String,String> function1=(name)->name.toUpperCase();
    static Function<String,String> function2=String::toUpperCase;
    static Consumer<Student> consumer1=Student::new;
    static Consumer<Student> consumer2=(student)-> System.out.println(student.getName().concat(" - Java Developer"));
    static Consumer<Student> consumer3=ConstructorReferenceExample::printName_With_Designation;

    private static void printName_With_Designation(Student student) {
        System.out.println(student.getName().concat(" - Java Developer"));
    }

    public static void main(String[] args) {
        consumer1.accept(StudentDatabase.studentSupplier.get());
        System.out.println(function1.apply("prateek arya"));
        System.out.println(function2.apply("kunal singh"));
        consumer2.accept(StudentDatabase.studentSupplier.get());
    }
}
