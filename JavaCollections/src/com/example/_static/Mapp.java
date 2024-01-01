package com.example._static;

import java.util.*;

public class Mapp {
    public static void main(String[] args) {
        Map<String,String> languages=new HashMap<>();
        System.out.println(languages.put("Java","a compiled high level,Object oriented language"));
        System.out.println(languages.put("Java","A compiled high level,Object oriented language"));
        System.out.println(languages.put("Python","a Interpreted,Object oriented language"));
        System.out.println(languages.putIfAbsent("Python","A Interpreted,Object oriented language"));
        System.out.println(languages.get("Java"));
        System.out.println(languages.get("Python"));
        if(languages.containsKey("Java")){
            System.out.println("Java already in map");
        }else
            System.out.println(languages.put("Java","a compiled high level,Object oriented language"));

        if(languages.containsValue("A compiled high level,Object oriented language"))
            System.out.println("Value already exist");


        System.out.println("==================");
        for(String key:languages.keySet())
            System.out.println(key+" : "+languages.get(key));
        System.out.println("==================");
//        System.out.println(languages.remove("Java","hey"));
//        System.out.println(languages.remove("Java"));
//        System.out.println(languages.remove("Python","a Interpreted,Object oriented language"));
//        System.out.println(languages.remove("Python"));
        System.out.println(languages.replace("java","ok"));
        System.out.println(languages.replace("Java","ok"));
        System.out.println(languages.replace("Python","a Interpreted,Object oriented language","P for python"));
        System.out.println("==================");
        for(String key:languages.keySet())
        System.out.println(key+" : "+languages.get(key));
        System.out.println("==================");
    }
}
