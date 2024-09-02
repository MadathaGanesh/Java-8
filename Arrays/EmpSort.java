import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class EmpSort implements Comparable<EmpSort> {
    private int id;
    private String name;

    public EmpSort(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "\n Employee [ID=" + id + "name=" + name + "]";

    }

    // Comparing acc to ID
    // public int compareTo(EmpSort other) {
    // System.out.println("compareTo called");
    // return this.id - other.id;
    // }

    // Comparing acc to name
    public int compareTo(EmpSort other) {
        return this.name.compareTo(other.name);
    }

    public static void main(String[] args) {
        List<EmpSort> employees = new ArrayList<>();
        employees.add(new EmpSort(1, "Ganesh"));
        employees.add(new EmpSort(4, "Rames"));
        employees.add(new EmpSort(2, "Sunny"));
        employees.add(new EmpSort(8, "Hanei"));
        employees.add(new EmpSort(6, "THnak"));
        Collections.sort(employees);
        System.out.println("Employees are" + employees);
    }

}
