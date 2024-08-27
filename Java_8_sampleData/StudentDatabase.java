package Java_8_sampleData;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {

    public static Supplier<Student> studentSupplier=()->{
        return new Student("prateek arya",3,3.4, Arrays.asList("music","programming"));
    };

    public static List<Student> getAllStudents(){
        Student student1=new Student("prateek arya",3,3.4, Arrays.asList("music","programming"));
        Student student2=new Student("varnita makrariya",6,6.4, Arrays.asList("guitar","programming"));
        Student student3=new Student("vikas kumar",5,4.4, Arrays.asList("dancing","programming"));
        Student student4=new Student("shubam",6,3.4, Arrays.asList("music","programming"));
        Student student5=new Student("amrit pal singh",3,4.4, Arrays.asList("podcast","programming"));
        Student student6=new Student("kavita singh",3,7.4, Arrays.asList("music","programming"));
        return List.of(student1,student2,student3,student4,student5,student6);
    }
}
