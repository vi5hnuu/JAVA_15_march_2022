package com.example._static;

import java.util.Scanner;

public class StringMatch {
    public static void main(String[] args) {
        java.util.Scanner scn=new Scanner(System.in);
        System.out.print("Enter a string text :");
        String text=scn.nextLine();
        System.out.print("Enter string pattern :");
        String pattern=scn.nextLine();

        int index=match(text,pattern);
        if(index>=0)
            System.out.println("matched at "+index);
        else
            System.out.println("Unmatched");
    }

    public static int match(String text,String pattern){
        for(int i=0;i<text.length()-pattern.length();i++){
            if(isMatched(i,text,pattern)){
                return i;
            }
        }
        return -1;
    }

    private static boolean isMatched(int i,String text,String pattern){
        for(int k=0;k<pattern.length();k++){
            if(pattern.charAt(k)!=text.charAt(i+k))
                return false;
        }
        return true;
    }
}
