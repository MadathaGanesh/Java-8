
import java.util.*;

public class PriorityyQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(8);
        pq.add(3);
        pq.add(5);
        pq.add(12);

        List<Integer> top2 = new ArrayList<>();
        int index = 0;
        while (!pq.isEmpty()) {
            if (index == 2)
                break;
            top2.add(pq.poll());
            index++;
        }
        System.out.println("pq:" + pq);
        System.out.println("top2:" + top2);
    }

}
