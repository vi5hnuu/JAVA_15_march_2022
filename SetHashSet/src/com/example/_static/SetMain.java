package com.example._static;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares=new HashSet<>();
        Set<Integer> cubes=new HashSet<>();
        for(int i=1;i<=100;i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }
        System.out.println("There are "+squares.size()+" squares");
        System.out.println("There are "+cubes.size()+" cubes");
//        Set<Integer> union=new HashSet<>(squares);
//        union.addAll(cubes);
//        System.out.println("Union has "+union.size());
//
//        Set<Integer> intersection=new HashSet<>(squares);
//        intersection.retainAll(cubes);
//        System.out.println("intersection has "+intersection.size());
//        for(int x:intersection)
//            System.out.println(x+" is both sqrt and cbrt "+Math.sqrt(x)+" "+Math.cbrt(x));
//
//        Set<Integer> diff=new HashSet<>(squares);
//        diff.removeAll(cubes);
//        System.out.println("diff has "+diff.size());
//        for(int x:diff)
//            System.out.println(x+" is sqrt but not cbrt "+Math.sqrt(x)+" "+Math.cbrt(x));

        Set<String> words=new HashSet<>();
        String sentence="One day in the year of fox";
        String[] arrayWords=sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords)); //Arrays.asList(arrayWords) return ArrayList which is Collection...addAll require collection as parameter

        System.out.println(words);

        Set<String> nature=new HashSet<>();
        Set<String> divine=new HashSet<>();
        String[] arrayWordss={"All","nature","is","but","art","unknown","to","the"};
        String[] divineWordss={"to","err","is","human","to","forgive","divine"};
        nature.addAll(Arrays.asList(arrayWordss));
        divine.addAll(Arrays.asList(divineWordss));

        System.out.println("nature - divine");
        Set<String> diff1=new HashSet<>(nature);
        diff1.removeAll(divine);
        System.out.println(diff1);

        System.out.println("divine - nature");
        Set<String> diff2=new HashSet<>(divine);
        diff1.removeAll(nature);
        System.out.println(diff2);

        System.out.println(diff1.containsAll(diff2));
        System.out.println(diff1.contains("All"));
    }
}
