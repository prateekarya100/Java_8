package Java8.StreamsApi.MapMethod__Examples;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class Streams__MapFunctionExample {
    static List<Student> studentList= StudentDatabase.getAllStudents();
//    map() changes types of streams input

//    getting list of name strings as an output using map
//    stream<Student> --> name<String>
    public static List<String> students__Name__List(){
        return studentList.stream()
                .map(Student::getName)
                .collect(Collectors.toList()); //List<String>
    }
    public static void main(String[] args) {
        System.out.println(students__Name__List());
    }
}
