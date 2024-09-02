package Interfaces;

public class Main implements Interface {

    // Implementing the add Interface

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Main obj = new Main();
        obj.add(3, 5);
        Interface.thanks(); // Assessing the static method using Interface.method name

        obj.description();

        int result = obj.add(2, 4); // storing the result using objectName and methodName
        System.out.println("Addition is :" + result);

        // Using lambda function
        // Lambda Expression (since Calculator is a functional interface)
        Interface lambdaCalculator = (a, b) -> a * b; // Interface objname=(varaibles)->Math operation
        System.out.println("Lambda product result: " + lambdaCalculator.add(10, 20));
    }

}
