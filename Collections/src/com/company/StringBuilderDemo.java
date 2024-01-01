package com.company;

//public class StringBuilderDemo {
//    public static void main(String args[]) {
//        String s1 = new String("ABC");
//        String s2 = new String("ABC");
//        System.out.println(s1.equals(s2));
//        StringBuilder sb1 = new StringBuilder("ABC");
//        StringBuilder sb2 = new StringBuilder("ABC");
//        System.out.println(sb1.equals(sb2));
//    }
//}


public class StringBuilderDemo {
    public static void main(String args[]) {
        String s = "Hello";
        s.concat("World"); //return new array as String is immutable
        System.out.println(s);
    }

}
/*We can use the equals() method for comparing two strings in Java
since the String class overrides the equals() method of the Object
class, while StringBuilder doesn't override the equals() method of the
Object class and hence equals() method cannot be used to compare two
StringBuilder objects.
 */