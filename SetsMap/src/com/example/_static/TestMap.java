package com.example._static;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Andreson",31);
        hashMap.put("Lewis",29);
        hashMap.put("Coock",29);

        System.out.println("Display entries in hashMap");
        System.out.println(hashMap);

        Map<String,Integer> treeMap=new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of keys");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap=new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Andreson",31);
        linkedHashMap.put("Lewis",29);
        linkedHashMap.put("Coock",29);

        System.out.println("The age for "+" lewis is "+linkedHashMap.get("Lewis"));

        System.out.println("Display entries in linkedHashMap");
        System.out.println(linkedHashMap);

        treeMap.forEach((name,age)-> System.out.println(name+" : "+age+" "));
    }
}
