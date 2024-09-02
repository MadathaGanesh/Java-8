package Lambdas.Example1;

public class Main1 implements Interface1 {

    // Implementation of greeting method declared in Inferace
    public void greeting() {
        System.out.println("I am good");
    }

    public static void main(String[] args) {
        // Main1 obj = new Main1();
        // obj.greeting();

        // Here we are directly implementing the interface with no parameters
        Interface1 obj = () -> {
            System.out.println("I am Good");
        };
        obj.greeting();
    }
}
