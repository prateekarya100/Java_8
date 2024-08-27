package Java8.FunctionalInterface.UnaryOperator_Interface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    static UnaryOperator<String> unaryOperator=(s -> s.concat("default"));
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java8"));
    }
}
