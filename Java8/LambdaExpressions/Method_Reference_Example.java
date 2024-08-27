package Java8.LambdaExpressions;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class Method_Reference_Example {
    static List<Student> studentList= StudentDatabase.getAllStudents();
//    static Consumer<Student> consumer1=s-> System.out.println(s);
    static Consumer<Student> consumer2 = System.out::println;
    static Consumer<Student> consumer3 = Student::printListOfActivities;
    static Consumer<Student> consumer4=Student::printName__And__GradeLevel;

    public static void main(String[] args) {
//        studentList.forEach(consumer1);
//        studentList.forEach(consumer2);
//        studentList.forEach(consumer3);
        studentList.forEach(consumer4.andThen(consumer3).andThen(consumer2));
    }
}
