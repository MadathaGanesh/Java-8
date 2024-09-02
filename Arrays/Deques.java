import java.util.Deque;
import java.util.ArrayDeque;

public class Deques {
    public static void main(String[] args) {

        Deque<Integer> deeq = new ArrayDeque<>();
        deeq.add(10);
        deeq.offerFirst(1);
        deeq.add(2);
        deeq.addLast(3432);
        deeq.add(23);
        deeq.offerLast(123);
        System.out.println("Befor esize" + deeq.size());

        System.out.println(deeq.isEmpty());
        System.out.println("Befor esize" + deeq.size());

        System.out.println("remove first:" + deeq.removeFirst());
        System.out.println("Remove Last:" + deeq.removeLast());

        System.out.println("ppel last:" + deeq.peekLast());
        System.out.println("peek irst:" + deeq.peekFirst());
        System.out.println("after:" + deeq.size());
    }
}
