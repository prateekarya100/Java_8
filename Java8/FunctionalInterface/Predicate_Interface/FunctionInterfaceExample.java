package Java8.FunctionalInterface.Predicate_Interface;

import java.util.function.Function;

public class FunctionInterfaceExample {

    static Function<String,String> function1=(name)->name.toUpperCase();
    static Function<String,String> function2=(name)->name.toUpperCase().concat("default");
    public static void main(String[] args) {
        System.out.println(function1.apply("prateek arya"));
        System.out.println(function1.andThen(function2).apply("prateek arya").concat("default"));
        System.out.println(function1.compose(function2).apply("prateek arya"));
    }
}
