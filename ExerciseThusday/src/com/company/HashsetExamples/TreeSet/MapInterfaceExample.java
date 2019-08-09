package com.company.HashsetExamples.TreeSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapInterfaceExample {
    public void mapInterface(){
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Me");
        hashSet.add("Me");

        for (String s : hashSet) {
            System.out.println(s);

        }
    }

    public void Map(){
        MapInterfaceExample mapp = new MapInterfaceExample();
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Francis");
        map.put(102, "Vijay");
        map.put(103, "Smith");

        for (Map.Entry m : map.entrySet()) {
            System.out.println("key = " + m.getKey() + " " + m.getValue());


        }
    }



}
