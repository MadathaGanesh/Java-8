package Mapss;

import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(5);
        set1.add(3);
        set1.add(4);
        set1.add(1);
        System.out.println("set1 eements are:" + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(1);
        set2.add(100);
        set2.add(5);
        System.out.println("Set 2 eleemtats are:" + set2);
        System.out.println("Contains;" + set1.contains(3));

        System.out.println(":each loop");
        for (int i : set2) {
            System.out.println(i);
        }

        System.out.println("Retain only intersection elements");
        set2.retainAll(set1);
        System.out.println(set2);

        System.out.println("addall union");
        set1.addAll(set2);
        System.out.println(set1);

        System.out.println("remove all" + set1.removeAll(set2));

        List<Integer> arrays = new ArrayList<>();
        arrays.add(10);
        arrays.add(23);
        arrays.add(12);
        arrays.add(18);
        arrays.add(13);
        arrays.add(12);

        Set<Integer> set4 = new LinkedHashSet<>(arrays);
        System.out.println("set 4:" + set4);
        System.out.println(set1.hashCode());
        System.out.println(set1.hashCode());
        System.out.println(set1.hashCode());

    }
}
