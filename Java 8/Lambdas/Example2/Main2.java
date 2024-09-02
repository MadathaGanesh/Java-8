package Lambdas.Example2;

public class Main2 {

    public static void main(String[] args) {
        AdditionInterface addobj;
        addobj = (int x, int y, int z) -> x + y + z;

        ProductInterface prodobj;
        prodobj = (int x, int y) -> { // Block of code
            int mul = x * y;
            return mul;
        };

        Squares squareobj;
        squareobj = r -> r * r;

        System.out.println("Square root is :" + squareobj.square(3.0f));

        System.out.println("Addition is: " + addobj.addition(10, 34, 60));

        System.out.println("Product is :" + prodobj.product(10, 20));

        prodobj.Ready(); // Calling default method from interface using interfaceObjectName

        ProductInterface.run(); // calling static method from interface using InterfaceClassName
    }
}
