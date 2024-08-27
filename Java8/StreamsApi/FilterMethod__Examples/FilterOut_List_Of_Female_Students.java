package Java8.StreamsApi.FilterMethod__Examples;

import Java8.StreamsApi.data.Student;
import Java8.StreamsApi.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterOut_List_Of_Female_Students {
    static List<Java8.StreamsApi.data.Student> studentList=StudentDatabase.getAllStudents();
    static Predicate<Java8.StreamsApi.data.Student> predicate=(student -> student.getGender().equals("female"));

    static Function<List<Student>, HashMap<String,String>> biFunction=(students)->{
        HashMap<String,String> hashMap=new HashMap<>();
        studentList.forEach(student -> {
            if (predicate.test(student)){
                hashMap.put(student.getName(),student.getGender());
            }
        });
        return hashMap;
    };

    public static void main(String[] args) {
//        System.out.println(filter_out_female_students());
//        System.out.println(biFunction.apply(StudentDatabase.getAllStudents()));
//        biFunction.apply(StudentDatabase.getAllStudents()).forEach((name, gender) -> {
//            System.out.println(name+" -> "+gender);
//        });
//        System.out.println(filterStudents());
//        filterStudents().forEach(System.out::println);
    }

    private static List<Student> filter_out_female_students() {
        return studentList.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
    public static List<Student> filterStudents(){
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .collect(Collectors.toList());
    }
}
