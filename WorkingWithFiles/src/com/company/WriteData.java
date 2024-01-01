package com.company;

public class WriteData {
    public static void  main(String[] args){
        java.io.File file=new java.io.File("Score.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(-1);
        }
        try(java.io.PrintWriter output=new java.io.PrintWriter(file)) {
            output.print("Vishnu kumar ");
            output.println(90);
            output.print("Krishan kumar ");
            output.print(100);
        }//catch can be omitted here
        catch (java.io.FileNotFoundException ex){
            System.out.println("File opening error.");
        }
    }
}
