package com.company;

public class TestException {
    public static  void main(String[] args){
       try{
        System.out.println(sum(new int[]{1,2,3,4,5}));
        }
       catch(Exception ex){
            ex.printStackTrace();
           System.out.println("-------------");
           System.out.println("\n"+ex.getMessage());
           System.out.println("-------------");
           System.out.println("\n"+ex.toString());
           System.out.println("-------------");
           System.out.println("\nTrace info obtained from getstacktrace");
           System.out.println("-------------");
           StackTraceElement[] stackTraceElements=ex.getStackTrace();
           for(int i=0;i<stackTraceElements.length;i++){
               System.out.println("Method "+stackTraceElements[i].getMethodName());
               System.out.println("("+stackTraceElements[i].getClassName()+":");
               System.out.println(stackTraceElements[i].getLineNumber());
           }
        }
    }

    public static int sum(int[] list){
        int result=0;
        for(int i=0;i<=list.length;i++)
            result+=list[i];
        return result;
    }

}
