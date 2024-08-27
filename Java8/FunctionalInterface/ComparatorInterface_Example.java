package Java8.FunctionalInterface;

import java.util.Comparator;

public class ComparatorInterface_Example {
    public static void main(String[] args) {
//------------------------------------------------------------------------
//  Imperative use of Comparator Interface
//------------------------------------------------------------------------
        Comparator<Integer> comparator1=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
                /*
                    0--> o1==o2
                    1--> o1>o2
                    -1--> o1<o2
                * */
            }
        };
        System.out.println("Comparator1 :: "+comparator1.compare(53,32));
//------------------------------------------------------------------------
//      [Java_8] Declarative way of using Comparator
//------------------------------------------------------------------------
        Comparator<Integer> comparator2 = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Comparator2 ::"+comparator2.compare(34,67));
//------------------------------------------------------------------------

//------------------------------------------------------------------------
//      [Java_8] Declarative way of using Comparator
//        ALSO WE CAN REMOVE DATA TYPES AND CURLY BRACES
//------------------------------------------------------------------------
        Comparator<Integer> comparator=(a,b)->a.compareTo(b);
        System.out.println("comparator :: "+comparator.compare(3,7));

    }
}
