package BiConsumer__Interface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class BiConsumer__RealTimeExample {
    static List<Student> studentList=StudentDatabase.getAllStudents();
    static Predicate<Student> predicate1=(student -> student.getGpa()>3);
    static Predicate<Student> predicate2=(student -> student.getGradeLevel()>=5.5);

        static BiConsumer<String,List<String>> biConsumer=(name,hobbies)-> System.out.println(name+" ==> "+hobbies);

    public static void main(String[] args) {
        studentList.forEach(student -> {
            if (predicate1.and(predicate2).test(student)){
                biConsumer.accept(student.getName(),student.getHobbies());
            }
        });
    }
}
