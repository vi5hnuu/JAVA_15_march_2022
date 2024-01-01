package com.company;

//public class tryy {
//    public static void main(String[] args){
//        String[] elements = { "abc", "xyz", "pqr" }; //array of objects (string is class)
//        String first = elements[0]; //string class is object so elements[0] is reference
//        first="vishnu";
//        System.out.println(elements[0]);
//        elements[0]="VISHNU";
//        System.out.println(elements[0]);
//
//
//
//    }
//}

public class tryy {
    public static void main(String[] args) {
        Boolean test = new Boolean(true);
        Integer x = 343;
        Integer y = new tryy().go(test, x); //notice
        System.out.println(y);
    }

    int go(Boolean b, int i) {
        if (b)
            return (i / 7);
        return (i / 49);
    }
}