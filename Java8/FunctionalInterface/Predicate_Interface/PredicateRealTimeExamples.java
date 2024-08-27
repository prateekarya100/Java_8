package Java8.FunctionalInterface.Predicate_Interface;


import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateRealTimeExamples {
    static List<Student> studentList= StudentDatabase.getAllStudents();
    static Predicate<Student> predicate1=(student)-> student.getGpa()>=4;
    static Predicate<Student> predicate2=(student -> student.getGradeLevel()>4.5);
    public static Predicate<Student> predicate3=(student -> student.getGpa()>3);
    static Predicate<Student> predicate4=(student -> student.getGradeLevel()>3.5);
    public static void main(String[] args) {
//          print details of those students who having gpa>4
//        checkStudentsHavingGpaMoreThan4();
//        checkStudentsHavingGpaMoreThan4_Negate();
//        checkStudentsHavingGradeLevelMoreThan3();
        checkStudentsGpa__And__GradeLevelMoreThan3();
    }

//    NEGATE() result
    private static void checkStudentsHavingGpaMoreThan4_Negate() {
        studentList.forEach(student -> {
            if (predicate1.negate().test(student)) {
                System.out.println(student);
            }
        });
    }

    private static void checkStudentsHavingGradeLevelMoreThan3() {
        studentList.forEach(student -> {
            if (predicate4.and(predicate2).test(student)){
                System.out.println(student);
            }
        });
    }

    //predicate+and()
    private static void checkStudentsGpa__And__GradeLevelMoreThan3() {
        studentList.forEach(student -> {
            if (predicate3.and(predicate4).test(student)){
                System.out.println(student);
            }
        });
    }

    //    predicate+test
    private static void checkStudentsHavingGpaMoreThan4() {
        studentList.forEach(student -> {
            if (predicate1.test(student)){
                System.out.println(student);
            }
        });
    }
}
