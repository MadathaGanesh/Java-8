package Method_References;

import java.util.*;

public class StaticMethod {
    public static void main(String[] args) {
        List<Integer> listobj = Arrays.asList(3, 2, 5, 1, 52, 46, 23);

        // Using method reference to refer to a static method {ClassName::MethodName}
        listobj.forEach(StaticMethod::PrintNumbers);

    }

    // Here I am creating a static method named "PrintNumbers"
    public static void PrintNumbers(Integer num) {
        System.out.println("Numbers in Array are :" + num);
    }
}
