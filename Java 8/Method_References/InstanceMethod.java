package Method_References;

import java.util.Arrays;
import java.util.List;

public class InstanceMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Ravi", "KAasi", "RGV", "Bhairava");

        // Creating object for class
        InstanceMethod objectName = new InstanceMethod();

        // Using { ObjectName::InstanceMethodName } for accessing
        names.forEach(objectName::NamesInstanceMethod);
    }

    // Creating Instance method for printing names and statements
    public void NamesInstanceMethod(String n) {
        System.out.println("Printing names using instance method : " + n);
    }
}
