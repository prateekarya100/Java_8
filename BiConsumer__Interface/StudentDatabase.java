package BiConsumer__Interface;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
    public static List<Student> getAllStudents(){
        return Arrays.asList(
                new Student("prateek arya",6,6.5D,Arrays.asList("music","programming")),
                new Student("ravina yadav",4,5.5D,Arrays.asList("music","cricket","programming")),
                new Student("nitin kumar",4,4.5D,Arrays.asList("cricket","programming")),
                new Student("ritesh arya",2,5.5D,Arrays.asList("music","cricket","running")),
                new Student("kunal singh",3,3.5D,Arrays.asList("music","cricket")),
                new Student("aman singhla",3,6.5D,Arrays.asList("music","programming","reading"))
        );
    }
}
