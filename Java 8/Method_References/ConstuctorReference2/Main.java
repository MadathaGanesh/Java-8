package Method_References.ConstuctorReference2;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        // Using BiFunction to reference the constructor (to take two values as input )
        BiFunction<String, Integer, EmployeeClass> NewEmployee = EmployeeClass::new;

        // Create a new EmployeeClass instance using apply() method
        EmployeeClass emp = NewEmployee.apply("Ganesh", 8);
        System.out.println(emp);
    }
}
