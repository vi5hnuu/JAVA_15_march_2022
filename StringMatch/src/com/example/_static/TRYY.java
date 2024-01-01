package com.example._static;

public class TRYY {
    public static void main(String[] args) {
        String s1=new String("Vishnu");
        String s2=new String("Vishnu");
        String s3="Vishnu";
        String s4="Vishnu";
        String s6="Vishnu";
        String s5=s4.substring(2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
        System.out.println(s6.hashCode());

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s4);
        System.out.println(s3==s4);
        System.out.println(s3==s6);
        String s="i "+"love "+"You";
        System.out.println(s);
    }

}
