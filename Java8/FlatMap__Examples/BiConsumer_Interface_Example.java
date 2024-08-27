package Java8.FlatMap__Examples;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumer_Interface_Example {
    static List<Student> studentList=StudentDatabase.getAllStudents();
//    static BiConsumer<String,Double> biConsumer=((name, gradeLevel) -> {
//        System.out.println(name+" :: "+gradeLevel);
//    });
//    public static void main(String[] args) {
//        biConsumer.accept(StudentDatabase.studentSupplier.get().getName(),StudentDatabase.studentSupplier.get().getGradeLevel());
//    }

    static BiConsumer<String, List<String>> biConsumer=((name, activities) -> {
        System.out.println(name+" :: "+activities);
    });
    public static void main(String[] args) {
        studentList.forEach(student -> {
            biConsumer.accept(student.getName(),student.getActivities());
        });
    }
}
