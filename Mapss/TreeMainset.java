package Mapss;

import java.util.*;

public class TreeMainset {

    // @Override
    // public int compare(Treeset1 o1, Treeset1 o2) {
    // System.out.println("Compare called");
    // return o1.getName().compareTo(o2.getName());
    // }

    public static void main(String[] args) {
        Set<Treeset1> setobj = new TreeSet<>((s1, s2) -> s1.getName().compareTo(s2.getName()));
        setobj.add(new Treeset1(12, "whw"));
        setobj.add(new Treeset1(13, "Hweo"));
        setobj.add(new Treeset1(2, "sdjer"));
        setobj.add(new Treeset1(1, "Hweo"));
        setobj.add(new Treeset1(10, "anqwi"));
        setobj.add(new Treeset1(9, "wjwe"));
        System.out.println(setobj);
    }

}
