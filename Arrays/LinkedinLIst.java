import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedinLIst {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("helkl");
        names.add("2uew0");
        names.add("wjei");

        System.out.println("ENterd names");
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("After sprting");
        Collections.sort(names);
        for (String nam : names) {
            System.out.println(nam);
        }

        // Using ListIterator
        System.out.println("Using ListIterator");
        ListIterator iter1 = names.listIterator();
        // while (iter1.hasNext()) {
        // System.out.println(iter1.next());
        // }

        System.out.println("Singles");
        System.out.println(iter1.previous());
        System.err.println(iter1.hasPrevious());
        System.out.println(iter1.next());
        System.out.println(iter1.next());
        System.out.println(iter1.next());
        System.out.println("eoerrs :::::" + iter1.hasPrevious());

    }

}
