package com.example._static;

import java.util.*;

public class CountOccurancesOfWords {
    public static void main(String[] args) {
        String text="Good morning. Have a good class Have a good visit. Have fun!";

        Map<String,Integer> map=new TreeMap<>();

        String[] words=text.split(" ");
        for(int i=0;i<words.length;i++){
            String key=words[i].toLowerCase();
            if(key.length()>0){
                if(!map.containsKey(key))
                    map.put(key,1);
                else
                    map.put(key,map.get(key)+1);
            }
        }
        map.forEach((k,v)-> System.out.println(k+"\t"+v));
    }
}
