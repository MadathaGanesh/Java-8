package Streams;

import java.util.*;

// ParallelStreams() and filter() method and anyMatch() method
public class ParallelStream {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rana", "Bhai", "Ranis", "NAni", "Praboss", "Ram");

        // It checks and returns a boolean value if Name starts with letter "R"
        boolean result = names.stream()
                .anyMatch(name -> name.startsWith("R"));
        System.out.println("Say true if any name start with letter 'R'? " + result);

        // Printing the names that start with letter "R".
        System.out.println("Printing names that start with letter 'R'::: ");
        names.stream().filter(name -> name.startsWith("R")).forEach(s -> System.out.print(s + " , "));
    }
}
