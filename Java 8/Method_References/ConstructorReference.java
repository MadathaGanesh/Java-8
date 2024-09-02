package Method_References;

import java.util.function.Function;

public class ConstructorReference {
    private String message;

    // Constructor with one argument
    public ConstructorReference(String message) {
        this.message = message;
    }

    public void MessageData() {
        System.out.println("Message is : " + message);
    }

    public static void main(String[] args) {

        // Using constructor reference with Function
        Function<String, ConstructorReference> func = ConstructorReference::new;

        // Create a new instance of ConstructorReference class using the constructor
        // that accepts a String
        ConstructorReference example = func.apply("Hello! I am from constructor message");
        example.MessageData();
    }
}
