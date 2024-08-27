package Java8.StreamsApi.MapMethod__Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert__CityNames__UpperCase {
    static List<String> cityList= Arrays.asList("noida","mathura","greater noida","bhiwadi","gwalior");
    public static void main(String[] args) {
        System.out.println(cityList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()));
    }
}
