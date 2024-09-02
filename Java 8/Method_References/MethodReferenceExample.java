package Method_References;

import java.util.*;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("RAna", "eew", "Babu", "Praboss");

        // Referring to an instance method of an arbitrary object of a particular type
        data.forEach(String::toLowerCase);
        data.forEach(System.out::println); // Will print the original words
    }
}
