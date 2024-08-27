package Java8.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;

public class Java8UpperCaseExample {
    static Consumer<String> consumer=(name)-> System.out.println(name.toUpperCase());
    static Function<String,String> function=(name)->name.toUpperCase();
    public static void main(String[] args) {
        convertNameIntoUpperCase();
        NameIntoUpperCase__using__FunctionInterface();
    }

    private static void NameIntoUpperCase__using__FunctionInterface() {
        System.out.println(function.apply("prateek arya"));
    }

    private static void convertNameIntoUpperCase() {
        consumer.accept("varnita makrariya");
    }
}
