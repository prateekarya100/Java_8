package Java8.StreamsApi.MapMethod__Examples;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapped__Countries_Example {
    static List<List<String>> country= Stream.of(
            Arrays.asList("Colombia", "Finland", "Greece", "Iceland", "Liberia", "Mali", "Mauritius"),
            Arrays.asList("Peru", "Serbia", "Singapore", "Turkey", "Uzbekistan", "Yemen", "Zimbabwe", "Greece", "Iceland")).toList();

    public static void main(String[] args) {
        System.out.println(country.stream()
                        .flatMap(Collection::stream)
                .collect(Collectors.toList()));
    }
}
