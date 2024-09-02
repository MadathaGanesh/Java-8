package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
        public static void main(String[] args) {
                List<Integer> listObj = Arrays.asList(12, 21, 13, 28, 3, 91, 10, 56);

                List<String> names = Arrays.asList("ganesh", "ravi", "boodee", "Rakesh", "naven", "kasis");

                List<Double> doubleobj = Arrays.asList(2.32, 12.32, 21.25, 19.02, 1.25);

                Double doublesum = doubleobj.stream().mapToDouble(n -> n).sum();
                System.out.println("Double values sum is : " + doublesum);

                // Sum using reduce() function
                int reduceSum = listObj.stream().reduce(0, Integer::sum);
                System.out.println("Sum using reduce() method :: " + reduceSum);

                int sum = listObj.stream().filter(n -> n > 15).mapToInt(n -> n).sum();
                System.out.println("The sum using sum() method above number 15 is: " + sum);

                System.out.println("Numbers after dividing by 2 is :");
                listObj.stream()
                                .map(x -> x / 2)
                                .forEach(n -> System.out.print(n + " , "));

                // Printing top 5 names
                System.out.println();
                names.stream()
                                .map(String::toUpperCase)
                                .limit(3)
                                .forEach(m -> System.out.println("First 3 names is : " + m));

                // Printing names
                System.out.println("Printing all names");
                List<String> details = names.stream()
                                .map(String::toLowerCase)
                                .sorted()
                                .collect(Collectors.toList());
        }

}