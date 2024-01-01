package com.company;

public class tryy implements Cloneable{
    int x;
    public tryy(int x){this.x=x;}
    @Override
    public Object clone(){
        return new tryy(this.x);
    }
public static void main(String[] args){
    tryy a=new tryy(10);
    tryy c=a;
//    tryy b=a.clone(); //override clone as clone is protected in object class and it is not in same package
    tryy b=(tryy)a.clone(); //after override clone
    System.out.println(a==b);
    System.out.println(a==c);
    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
    }
}


