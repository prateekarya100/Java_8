package Java8.FunctionalInterface.Comsumer_Interface;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample1 {
    static Consumer<String> c1 = (s -> System.out.println(s.toUpperCase()));
    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.println(student.getName() + " ");
    static Consumer<Student> c5 = (student) -> System.out.println(student.getActivities());

    static Consumer<Student> c6 = (student -> System.out.print(student.getName() + " "));
    static Consumer<Student> c7 = (student -> System.out.println(student.getGradeLevel()));

    public static void main(String[] args) {
//        make a string in upperCase using java 8 by consumer interface
//        consumer.accept("springboot");
//        printName();
//        printNameAndGradeLevelMoreThan5();
//        printStudentDetails();
//        printNameAndActivities();
        printNameAndActivities2();
    }

//    private static void printNameAndActivities() {
//        List<Student> studentList=StudentDatabase.getAllStudents();
//        studentList.forEach(student -> {
//            if (student.getGradeLevel()>=3){
//                System.out.println(student.getName()+" "+student.getActivities());
//            }
//        });
//    }

    public static void printNameAndActivities2(){
        List<Student> studentList= StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if (student.getGradeLevel()>=3){
                c6.andThen(c5).accept(student);
            }
        });
    }

    private static void printName() {
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(c3);
    }

    private static void printNameAndGradeLevelMoreThan5() {
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((student) -> {
            if (student.getGradeLevel() >= 3) {
                c6.andThen(c7).accept(student);
            }
        });
    }

    //
    public static void printStudentDetails() {
//        Consumer<Student> studentConsumer= System.out::println;
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(c2);
    }
}