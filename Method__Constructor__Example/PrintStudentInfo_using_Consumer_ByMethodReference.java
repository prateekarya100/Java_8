package Method__Constructor__Example;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.function.Consumer;

public class PrintStudentInfo_using_Consumer_ByMethodReference {
    /*  Simply prints student without any reference
     * */
    static Consumer<Student> studentConsumer1=(student -> System.out.println(student));

    /*  Print Student Info by Method Reference
    * */
    static Consumer<Student> studentConsumer2=PrintStudentInfo_using_Consumer_ByMethodReference::printStudent_Info;

    /*  Print Student Info by Method Reference
     * */
    static Consumer<Student> studentConsumer3= System.out::println;

    /*  Print Student Info by Instance-Method
     *  Reference created inside Student class
     * */
    static Consumer<Student> studentConsumer4=Student::printListOfActivities;
    private static void printStudent_Info(Student student) {
        System.out.println(student);
    }
    /**
     * Constructor Reference Method
     */
    static Consumer<String> studentConsumer5=Student::new;

    public static void main(String[] args) {
//        System.out.println("===================  Simply Print without any Reference  ====================");
//        StudentDatabase.getAllStudents().forEach(studentConsumer1);
//        System.out.println("===================  By Class Method Reference Calling  ====================");
//        StudentDatabase.getAllStudents().forEach(studentConsumer2);
//        System.out.println("==================  By Method Reference Calling  =====================");
//        StudentDatabase.getAllStudents().forEach(studentConsumer3);
//        System.out.println("================ BY Instance Method Calling =======================");
//        StudentDatabase.getAllStudents().forEach(studentConsumer4);
//        System.out.println("================ BY Constructor Calling =======================");
        studentConsumer5.accept(StudentDatabase.studentSupplier.get().getName());
    }
}
