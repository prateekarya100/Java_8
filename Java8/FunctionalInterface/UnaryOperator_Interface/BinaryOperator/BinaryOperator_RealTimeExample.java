package Java8.FunctionalInterface.UnaryOperator_Interface.BinaryOperator;

import Java_8_sampleData.StudentDatabase;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperator_RealTimeExample {
    static Comparator<Integer> comparator= Integer::compareTo;
    static BinaryOperator<Integer> employeeBinaryOperator=(Integer::compareTo);

    public static void main(String[] args) {
        System.out.println("minBy GPA :: "+BinaryOperator
                .minBy(comparator).apply(
                        StudentDatabase.getAllStudents().get(0).getGpa(),
                        StudentDatabase.getAllStudents().get(2).getGpa()));
        System.out.println("maxBy GPA :: "+BinaryOperator
                .maxBy(comparator).apply(
                        StudentDatabase.getAllStudents().get(0).getGpa(),
                        StudentDatabase.getAllStudents().get(2).getGpa()));
    }
}
