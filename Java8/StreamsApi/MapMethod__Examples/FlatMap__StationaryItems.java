package Java8.StreamsApi.MapMethod__Examples;

import Java_8_sampleData.Student;
import Java_8_sampleData.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap__StationaryItems {
    static List<Student> studentList = StudentDatabase.getAllStudents();

    static List<List<String>> stationary= Arrays.asList(
            Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard"),
            Arrays.asList("Scanner", "Projector", "Light Pen"),
            Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan"),
            Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power Bank")
    );
    public static void main(String[] args) {
        System.out.println(stationary.stream()
                .flatMap(List::stream)
//                .flatMap(Collection::stream)
                .collect(Collectors.toList()));

        System.out.println(studentList.stream() //Stream<Student>
//                .map(t -> t.getActivities())
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                        .distinct()
                .collect(Collectors.toList())); // List<String>
    }
}
