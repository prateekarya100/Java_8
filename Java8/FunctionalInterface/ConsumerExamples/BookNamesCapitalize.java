package Java8.FunctionalInterface.ConsumerExamples;

import java.util.Arrays;
import java.util.List;

public class BookNamesCapitalize {
    public static void main(String[] args) {
        List<Book> books= Arrays.asList(
                new Book(123L, "java begin", "RKK"),
                new Book(432L, "Digital logics", "KG"),
                new Book(412L, "mathmatics", "DL saini"));
        books.forEach(book -> {
            System.out.print(book.getName().toUpperCase()+" ");
            System.out.println(book.getAuthor().toUpperCase());
        });
    }
}
