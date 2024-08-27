package Java8.StreamsApi.Reduce_Method.EmployeeUseCase.UseCase1;

import java.util.Arrays;
import java.util.List;

public class Students_Library_BooksDatabase {
    public static List<Student> getAll_AllocatedBooks(){
        return Arrays.asList(
                new Student("prateek arya",3,7.5,"male",13),
                new Student("shivangi upadhyay",2,5.5,"female",10),
                new Student("vinit singh",5,6.5,"male",13),
                new Student("kunal singh",6,5.5,"male",15),
                new Student("naman singhal",2,3.5,"male",15),
                new Student("meenakshi narayanan",3,5.5,"female",16),
                new Student("sharath chintakuntala",5,7.5,"male",25),
                new Student("varnita makrariya",4,6.5,"female",15)
        );
    }
}
