package Lambdas.Example2;

public interface ProductInterface {
    public int product(int x, int y);

    default void Ready() {
        System.out.println("Bujji! are you ready");
    }

    static void run() {
        System.out.println("Bhairava! I am ready");
    }

}
