package Java8.FlatMap__Examples;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortedNames__streamsAPI {
    static  List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
    static List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
    static List<Integer> unsortedArray1=Arrays.asList(4,2,7,1);
    static List<Integer> unsortedArray2=Arrays.asList(8,3,9,5);
    static List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
    static List<String> list_of_friends = Arrays.asList("prateek arya", "aman kumar", "kavita singh", "naman pratap", "mahima hans", "varnita makrariya");
    static List<Student> studentList= StudentDatabase.getAllStudents();
    public static void main(String[] args) {
//        System.out.println(sorted_students_by_Names());
//        System.out.println(sorted_students_by_Names_in_Descending());
//        System.out.println(sorted_distinct_students_by_gpa_reversed());
//        System.out.println(decimalList_in_reversed_order());
//        System.out.println("maximum_double_number_from_decimal_list :: "+maximum_double_number_from_decimal_list());
//        System.out.println("minimum_double_number_from_decimal_list :: "+minimum_double_number_from_decimal_list());
//        System.out.println("maximum_number_from_integer_list :: "+maximum_number_from_integer_list());
//        System.out.println("minimum_number_from_integer_list :: "+minimum_number_from_integer_list());

//        System.out.println("three_maximum :: "+three_maximum());
//        System.out.println("three_minimum :: "+three_minimum());
//        System.out.println(Last_Element_of_list());
        System.out.println(name_of_Last_Friend_of_list());
    }

    private static String name_of_Last_Friend_of_list() {
        return list_of_friends.stream()
                .skip(list_of_friends.size()-1)
                .findAny().get();
    }

    private static String Last_Element_of_list() {
        return listOfStrings.stream()
                .skip(listOfStrings.size() - 1)
                .findFirst().get();
    }

    private static List<Integer> three_minimum() {
        return listOfIntegers.stream()
                .sorted()
                .limit(3).collect(Collectors.toList());
    }

    private static List<Integer> three_maximum() {
        return listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
    }


    private static int minimum_number_from_integer_list() {
        return listOfIntegers.stream().min(Comparator.comparingInt(Integer::valueOf)).get();
    }

    private static int maximum_number_from_integer_list() {
        return listOfIntegers.stream().max(Comparator.comparingInt(Integer::valueOf)).get();
    }

    private static double minimum_double_number_from_decimal_list() {
        return decimalList.stream().min(Comparator.comparing(Double::doubleValue)).get();
    }

    private static double maximum_double_number_from_decimal_list() {
        return decimalList.stream().max(Comparator.comparing(Double::doubleValue)).get();
    }

    private static List<Double> decimalList_in_reversed_order() {
        return decimalList.stream()
                .sorted(Comparator.comparing(Double::doubleValue).reversed())
                .collect(Collectors.toList());
    }

    private static List<Student> sorted_distinct_students_by_gpa_reversed() {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    private static List<Student> sorted_students_by_Names_in_Descending() {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .collect(Collectors.toList());
    }

    private static List<Student> sorted_students_by_Names() {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
}
