package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Filter {
    public static void main(String[] args) {

        List<Integer> listObj = Arrays.asList(122, 31, 30, 10, 45, 12, 23, 53);

        List<Integer> evenNumbers = listObj.stream()
                .filter(n -> n % 2 == 0).sorted()
                .collect(Collectors.toList());
        System.out.println("Even numbers in sorted order are: " + evenNumbers);

    }
}
