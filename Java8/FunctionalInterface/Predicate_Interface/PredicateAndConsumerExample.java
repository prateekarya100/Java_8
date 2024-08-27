package Java8.FunctionalInterface.Predicate_Interface;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

     Predicate<Student> p1=(student -> student.getGpa()>3);
     Predicate<Student> p2=(student -> student.getGradeLevel()>3);

    BiConsumer<String, List<String>> biConsumer=(name,activities)-> System.out.println(name+" :: "+activities);

    Consumer<Student> consumer=(student -> {
        if (p1.and(p2).test(student)){
            biConsumer.accept(student.getName(),student.getActivities());
        }
    });
    public static void main(String[] args) {
        List<Student> studentList= StudentDatabase.getAllStudents();
        new PredicateAndConsumerExample().print__NameAndActivities(studentList);
    }
    public void print__NameAndActivities(List<Student> studentList){
        studentList.forEach(consumer);
    }
}
