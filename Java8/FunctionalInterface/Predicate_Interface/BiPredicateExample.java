package Java8.FunctionalInterface.Predicate_Interface;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class BiPredicateExample {
    BiPredicate<Integer,Double> biPredicate1=(gpa,grade)->gpa>2 && grade<=5.5;
    BiPredicate<Integer,Double> biPredicate2=(gpa,grade) -> gpa<6 && grade>=2.5;
    Consumer<Student> consumer=(student -> {
       if (biPredicate1.and(biPredicate2).test(student.getGpa(),student.getGradeLevel())){
           System.out.println(student.getName()+" :: "+student.getActivities());
       }
    });

    static Consumer<String> consumer2=(name)-> System.out.println(name.toUpperCase());
    static Function<String,String> caps=(name)-> name.toUpperCase();
    public static void main(String[] args) {
        List<Student> studentList= StudentDatabase.getAllStudents();
        new BiPredicateExample().biPredicateConditionCheck(studentList);

        printCapitalNames();
        printCapitalNamesByFunction();
    }

    private static void printCapitalNamesByFunction() {
        System.out.println(caps.apply("caps using function"));
    }

    private static void printCapitalNames() {
        consumer2.accept("varnita makrariya");
    }

    private void biPredicateConditionCheck(List<Student> studentList) {
        studentList.forEach(consumer);
    }
}
