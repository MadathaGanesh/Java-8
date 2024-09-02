
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arraylistArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(3);
        arraylist.add(23);
        arraylist.add(21);

        arraylist.set(2, 8477);

        ArrayList<Integer> arrr2 = new ArrayList<>();
        arrr2.add(11);
        arrr2.add(22);
        arrr2.add(33);
        arrr2.set(1, 2323);
        arrr2.addAll(arraylist);

        System.out.println("Arrr2 elements are;");
        for (int i : arrr2) {
            System.out.println(i);
        }

        // ArrayList to array convertion
        Integer[] arrays = arrr2.toArray(new Integer[0]);
        System.out.println("After converting Arraylist to array:");
        for (Integer i : arrays) {
            System.out.println(i);
        }

        // Another way to convert arraylist to array
        System.out.println("Another way to convert arrayList to arrray");
        Object[] array1 = arrr2.toArray();
        for (Object j : array1) {
            System.out.println(j);
        }

        // Collections.sort(arraylist);
        // Iterator<Integer> iter = arraylist.iterator();
        // while (iter.hasNext()) {
        // System.out.println("ArrayList elements are: " + iter.next());

        // System.out.println("After sorintg");
        // Iterator<Integer> sorr = arraylist.iterator();
        // while (sorr.hasNext()) {
        // System.out.println("Sort:" + sorr.next());
        // }
        // }

    }
}