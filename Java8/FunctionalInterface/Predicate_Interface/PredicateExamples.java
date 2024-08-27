package Java8.FunctionalInterface.Predicate_Interface;

import java.util.function.Predicate;

public class PredicateExamples {
    static Predicate<Integer> p1=(p)-> p%2==0;
    static Predicate<Integer> p2=(p)-> p%5==0;
    static Predicate<Integer> p3=(p)-> p/2==0;
    static Predicate<Integer> p4=(p)-> p==10;
    public static void main(String[] args) {
 //    Test() -->TAKING INPUT
//    And() --> check condition
//    Negate() --> reverse current output
//    OR() --> check condition
//--------------------------------------------------

//        System.out.println(p1.test(5));
//        System.out.println(p1.test(6));

//        predicateAnd();
//        predicateOR();
        predicateNegate();
    }

    private static void predicateNegate() {
        System.out.println(p1.negate().test(5));
    }

    private static void predicateOR() {
        System.out.println(p1.or(p2).or(p4).test(8));
    }

    private static void predicateAnd() {
        System.out.println(p1.and(p2).test(10));
    }
}
