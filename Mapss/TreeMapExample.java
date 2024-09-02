package Mapss;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        NavigableMap<String, String> tmap = new TreeMap<>();
        tmap.put("hello", "world");
        tmap.put("ana", "bella");
        tmap.put("jawa", "bawaq");
        tmap.put("kaki", "raki");
        System.out.println("f=last:" + tmap.pollLastEntry());
        System.out.println("first" + tmap.pollFirstEntry());

        for (Map.Entry<String, String> entry : tmap.entrySet()) {
            System.out.println(entry);
        }
    }

}
