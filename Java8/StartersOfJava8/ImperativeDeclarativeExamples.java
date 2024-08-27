package Java8.StartersOfJava8;

import java.util.stream.IntStream;

public class ImperativeDeclarativeExamples {
    public static void main(String[] args) {
//        print the sum from 0-100
//        int sum=0;
//        for (int i = 0; i <=100 ; i++) {
//            sum+=i;
//        }
//        System.out.println("By Imperative Approach::"+sum);
//----------------------------------------------------------------------
        int sum2= IntStream.rangeClosed(0,100).sum();
        System.out.println("By Declarative Approach:: "+sum2);
    }
}
