package Interfaces;

@FunctionalInterface
public interface Interface {
    int add(int a, int b);

    // Using default method in java 8
    default void description() {
        System.out.println("This is description used by default using Java 8");
    }

    // Using static method in java 8
    static void thanks() {
        System.out.println("This is the thanks for java using static method");
    }
}
