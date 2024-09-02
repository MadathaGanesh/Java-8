package Mapss;

import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<Integer, String> obj = new HashMap<>();
        obj.put(2, "eejr");
        obj.put(3, "nulswel");
        obj.put(1, "Hqai");
        obj.put(9, "wjaia");
        obj.put(4, "aeom");

        System.out.println("Keys are: " + obj.keySet());
        System.out.println("Values are:" + obj.values());
        System.out.println("Entries:" + obj.entrySet());
        System.out.println("obj contains 4 " + obj.containsKey(4));
        System.out.println("remove:  :" + obj.remove(4));
        System.out.println("obj contains 4 " + obj.containsKey(4));
        System.out.println("getorDefault yes:" + obj.getOrDefault(9, "there"));
        System.out.println("getorDefault no:" + obj.getOrDefault(193823, "no"));

        for (Map.Entry<Integer, String> iter : obj.entrySet()) {
            System.out.println("Id is :" + iter.getKey() + " VAlue is: " + iter.getValue());
        }

        obj.forEach((key, value) -> System.out.println("key is :" + key + " value is:" + value));
    }

}
