package com.company;

public class Main {
    int i=5;
    static  int k=2;
    public static void main(String[] args) {
//    int =i; //wrong as i is instance vaiable and main is static method...think why it cant access it
//    m1(); //same reason

        Main a=new Main();
        int j=a.i; //ok we can alsor write Main.i
        a.m1(); //or Main.m1()
    }
    public void m1(){
        i=i+k+m2(i,k);
    }
    public static int m2(int i,int j){
        return (int)(Math.pow(i,j));
    }
}
