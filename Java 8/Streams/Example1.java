package Streams;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {

        List<String> listObj = Arrays.asList("HEllo", "Bujji", "Bhairava", "AA", "AA", "Bujji", "aa", "Ram", "AA");
        listObj.stream()
                .distinct()
                .map(String::toLowerCase)
                .forEach(n -> System.out.println(n));
    }
}
