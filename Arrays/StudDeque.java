import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class StudDeque {
    public static void main(String[] args) {
        List<StudMarks> marks = new ArrayList<>();
        marks.add(new StudMarks(89, 85));
        marks.add(new StudMarks(78, 98));
        marks.add(new StudMarks(79, 83));
        marks.add(new StudMarks(88, 70));
        marks.add(new StudMarks(58, 83));

        PriorityQueue<StudMarks> spq = new PriorityQueue<>(marks);
        List<StudMarks> top3 = new ArrayList<>();
        int index = 0;
        while (!spq.isEmpty()) {
            if (index == 3)
                break;
            top3.add(spq.poll());
            index++;
        }
        System.out.println("index :" + top3);

    }
}
