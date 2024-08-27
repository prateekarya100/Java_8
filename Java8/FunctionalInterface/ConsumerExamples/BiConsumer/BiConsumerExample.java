package Java8.FunctionalInterface.ConsumerExamples.BiConsumer;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

// ADDITION
    static BiConsumer<Integer,Integer> biConsumer1=(a,b)-> System.out.println("ADDITION :: "+(a+b));
// DIVIDE
    static BiConsumer<Integer,Integer> biConsumer2=(a,b)-> System.out.println("DIVIDE :: "+(a/b));
// MINUS
    static BiConsumer<Integer,Integer> biConsumer3=(a,b)-> System.out.println("MINUS :: "+(a-b));
// MULTIPLY
    static BiConsumer<Integer,Integer> biConsumer4=(a,b)-> System.out.println("MULTIPLY :: "+(a*b));


//----------------------------------------------------------------
//    BiConsumer -->
//            >> used for taking 2 input at a time
//            >> BiConsumer is extension of consumer interface

    static List<Student> studentList= StudentDatabase.getAllStudents();
    static BiConsumer<String,List<String>> b1=(name,activities)-> System.out.println(name+" "+activities);
    static BiConsumer<String,Integer> b2=(name,activities)-> System.out.println(name+" "+activities);

    public static void main(String[] args) {

//        biConsumer1.accept(20,5);
//        biConsumer2.accept(20,5);

//        combined statement // consumer chaining
//        biConsumer1.andThen(biConsumer2).accept(30,5);

        biConsumer1.andThen(biConsumer2).andThen(biConsumer3).andThen(biConsumer4).accept(30,5);

//-----------------------------------------------------------------------------------
//  REALTIME USE OF BiConsumer
//-----------------------------------------------------------------------------------
//     print property Name And Activities of student
//        printNameAndActivities();
//        printNameWhoGpaMoreThanEqual4();
    }

    private static void printNameWhoGpaMoreThanEqual4() {
        studentList.forEach(student ->
        {
            if (student.getGpa()>=4) {
                b2.accept(student.getName(),student.getGpa());
            }
        });
    }

    private static void printNameAndActivities() {
        studentList.forEach(student ->
                b1.accept(student.getName(), student.getActivities()));
    }
}
