
package Mapss;

import java.util.*;

public class Employee implements Comparator<InnerEmployee> {

    public int compare(InnerEmployee o1, InnerEmployee o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public static void main(String[] args) {
        List<InnerEmployee> employees = new ArrayList<>();
        employees.add(new InnerEmployee(3, "je"));
        employees.add(new InnerEmployee(33, "2je"));
        employees.add(new InnerEmployee(454, "awre"));
        employees.add(new InnerEmployee(8, "zwkee"));
        employees.add(new InnerEmployee(7, "ukwr"));
        employees.add(new InnerEmployee(23, "u4e"));
        employees.add(new InnerEmployee(13, "jse"));
        employees.add(new InnerEmployee(34, "je"));
        employees.add(new InnerEmployee(12, "qe"));
        Collections.sort(employees, new Employee());

        // Print top 3 employees using while loop
        int index = 0;
        while (index < 3 && index < employees.size()) {
            System.out.println("Employee: " + employees.get(index));
            index++;
        }

    }

}
