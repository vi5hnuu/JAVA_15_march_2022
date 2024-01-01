package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws Exception{
        if(args.length!=4){
            System.out.println("Usage: Java ReplaceText sourceFile targetFile oldstr newstr");
            System.exit(-1);
        }
       java.io.File sourceFile=new java.io.File(args[0]);
        if(!sourceFile.exists()){
            System.out.println("Source file "+args[0]+" does not exists");
            System.exit(2);
        }
        java.io.File targetfile=new java.io.File(args[1]);
        if(targetfile.exists()){
            System.out.println("Target file "+args[1]+" already exist");
            System.exit(3);
        }
        try(
            Scanner input=new Scanner(sourceFile);
            PrintWriter output=new PrintWriter(targetfile);
        ){
            while(input.hasNext()){
                String s1=input.nextLine(); //read \n and discard
                String s2=s1.replaceAll(args[2],args[3]);
                output.println(s2);
            }
        }
        }
    }

