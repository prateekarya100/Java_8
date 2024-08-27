package Java8.FunctionalInterface.Lambdas__LocalVariable_EffectiveFinal;

import java.util.function.Consumer;

public class RestrictionWithLocalVariable {
    static int value2=10;
    public static void main(String[] args) {
//        int value1=10;
        Consumer<Integer> consumer=(integer -> {
//            value1++; Not Allowed modification inside local scope
//            System.out.println(value1);

            value2++;
            System.out.println(value2+integer);
        });
        consumer.accept(2);
    }
}
