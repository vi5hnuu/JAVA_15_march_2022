package com.company;

public class TastThreadDedmo {
    public static void main(String[] args) {
        Runnable print100=new PrintNum(10);
        Runnable printA=new PrintChar('a',1000);
        Runnable printB=new PrintChar('b',1000);

        Thread t1=new Thread(printA);
        Thread t2=new Thread(printB);
        Thread t3=new Thread(print100);
        t3.start();
        t1.start();
        t2.start();

    }
}

//public  class xyz{} //error because public means access to all other package as well
//but as it is defined inside this clas it wont be accessible to all though after compile it will extracted individually..

//so use only class xyz{} if declaering inside a class...


class PrintChar implements Runnable{
    private char charToPrint;
    private  int times;
     public PrintChar(char c,int t){
         charToPrint=c;
         times=t;
     }
     @Override
    public void run(){
         for(int i=0;i<times;i++)
             System.out.print(charToPrint);
         System.out.println();

     }
}


class PrintNum implements Runnable{
    private  int lastNum;
    public PrintNum(int n){
        lastNum=n;
    }
    @Override
    public void run(){
        for(int i=0;i<=lastNum;i++){
            System.out.print(" "+i);
//        Thread.yield();
        }
        System.out.println();
    }

}