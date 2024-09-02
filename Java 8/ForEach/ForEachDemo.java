package ForEach;

import java.util.*;

// Traditional for loops offer greater control, direct access to indices, and flexibility but can be more verbose and less readable.
// Java 8 forEach simplifies iteration with a functional style,
// improves readability with lambda expressions,and integrates well with the Java Stream API for parallel processing.
public class ForEachDemo {

    public static void main(String[] args) {
        List<Integer> listobj = Arrays.asList(11, 2, 4, 23, 54, 34, 6, 56);

        // Using normal for loop to iterate the list
        System.out.println("Printing using normal loop");
        for (int i = 0; i < listobj.size(); i++) {
            System.out.print(listobj.get(i) + " , ");
        }

        // Using Enhanced forloop
        System.out.println("\n Printing using Enhanced loop");
        for (int j : listobj) {
            System.out.print(j + " , ");
        }

        // USing forEach() method
        System.out.println("\n Printing using forEach() method");
        listobj.forEach(k -> System.out.print(k + " , "));
    }
}
