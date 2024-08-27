package Java8.StreamsApi.data;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {
    public static Supplier<Student> studentSupplier=()->{
        return new Student("prateek arya","male",6,6.5D,Arrays.asList("music","programming"));
    };
    public static List<Student> getAllStudents(){
        return Arrays.asList(
                new Student("prateek arya","male",6,6.5D,Arrays.asList("music","programming")),
                new Student("ravina yadav","female",4,5.5D,Arrays.asList("music","cricket","programming")),
                new Student("nitin kumar","male",4,4.5D,Arrays.asList("cricket","programming")),
                new Student("ritesh arya","male",2,5.5D,Arrays.asList("music","cricket","running")),
                new Student("kunal singh","male",3,3.5D,Arrays.asList("music","cricket")),
                new Student("aman singhla","male",3,6.5D,Arrays.asList("music","programming","reading")),
                new Student("varnita makrariya","female",6,5.5D,Arrays.asList("music","guitar","programming","reading"))
        );
    }
}
