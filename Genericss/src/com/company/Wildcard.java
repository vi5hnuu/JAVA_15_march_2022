package com.company;

import java.util.Arrays;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sumOfList(li));
        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + sumOfList(ld));
    }

//    public static <T extends Shape> void draw(T shape) { /* ... */ } //T if ok
//    public static double sumOfList(List<T extends Number> list) { //T is not ok
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }

}
