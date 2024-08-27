package Java8.FunctionalInterface.ConsumerExamples;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class StudentConsumer {
    static List<Student> studentList= StudentDatabase.getAllStudents();
    static Consumer<Student> c1=(student -> System.out.print(student.getName()+" "));
    static Consumer<Student> c2=(student -> System.out.println(student.getGpa()+" "));
    static Consumer<Student> c3=(student -> System.out.println(student.getGradeLevel()+" "));
    static Consumer<Student> GpaMoreThan5=(student -> System.out.print(student.getGpa()+" "));
    static Consumer<Student> name=(student -> System.out.println(student.getName()));
//

    public static void main(String[] args) {
//        for (Student student : studentList) {
//            System.out.println(student);
//        }

//        studentList.forEach((student ->
//                name.accept(student)));

//           System.out.println(studentList.stream().filter(student -> student.getGpa()<=3).toList());
//        studentList.forEach(student ->
//        {
//            if (student.getGpa()>=3 && student.getActivities().contains("music")) {
//                GpaMoreThan5.andThen(name).accept(student);
//            }
//        });


//---------------------------------------------------
//        METHOD CALLINGS
//---------------------------------------------------
//        printNameAndActivities();
//        printNameWhoseGradeLevelBelow5();
    }

    private static void printNameWhoseGradeLevelBelow5() {
//        System.out.println(studentList.stream()
//                .filter(student -> student.getGpa()<=5)
//                .filter(student -> student.getActivities().contains("music"))
//                .toList());

//        studentList.forEach(student ->
//        {
//            if (student.getGpa()<=5 && student.getActivities().contains("music")) {
//                c1.andThen(c3).andThen(c2).accept(student);
//            }
//        });
    }

    private static void printNameAndActivities() {
        studentList.forEach(student ->
                c1.andThen(c2).accept(student));
    }
}
