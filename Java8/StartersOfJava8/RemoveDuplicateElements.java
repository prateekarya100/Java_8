package Java8.StartersOfJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {

//        Imperative Approach to Remove Duplicates
//        List<Integer> list= Arrays.asList(1,2,4,2,3,4);
//        HashSet<Integer> hashSet=new HashSet<>(list);
//        System.out.println(hashSet);
//------------------------------------------------------

//        Imperative Approach to Remove Duplicates
        List<Integer> arrayList = Arrays.asList(9,1,1,2,3,1,3,2,5,9,3,7,4);
//      Declarative Approach
        List<Integer> uniqueElements=new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (!uniqueElements.contains(arrayList.get(i))){
                uniqueElements.add(arrayList.get(i));
            }
        }
        System.out.println("uniqueElements :: "+uniqueElements);
//--------------------------------------------------------------------------
//        Declarative Approach to remove Duplicates
        List<Integer> uniqueElements2 = arrayList
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("uniqueElements2 :: "+uniqueElements2);
    }
}
