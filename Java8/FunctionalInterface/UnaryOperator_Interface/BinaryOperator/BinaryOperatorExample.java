package Java8.FunctionalInterface.UnaryOperator_Interface.BinaryOperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static Comparator<Integer> comparator=(a,b)->a.compareTo(b);
    static BinaryOperator<Integer> binaryOperator=(a,b)->a*b;
    public static void main(String[] args) {
//        System.out.println(binaryOperator.apply(4,6));
        System.out.println("maxBy :: "+BinaryOperator.maxBy(comparator).apply(4,6));
        System.out.println("minBy :: "+BinaryOperator.minBy(comparator).apply(4,6));
    }
}
