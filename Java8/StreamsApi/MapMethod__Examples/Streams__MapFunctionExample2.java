package Java8.StreamsApi.MapMethod__Examples;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.Set;
import java.util.stream.Collectors;

//getting students as stream input and return name of students in set collection
// stream<Student> --> name<strings>
public class Streams__MapFunctionExample2 {
    public static Set<String> students__Name_Set(){
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        System.out.println(students__Name_Set().getClass());
    }
}
