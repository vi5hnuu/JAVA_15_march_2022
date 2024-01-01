package com.company;

import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception{
        java.io.File file=new java.io.File("Score.txt");
        if(!(file.exists())){
            System.out.println("File not exists");
            System.exit(-1);
        }
        Scanner input=new Scanner(file);
        while(input.hasNext()){
            String firsname=input.next();
            String lastname=input.next();
            int score=input.nextInt();
            System.out.println(firsname+" "+lastname+" "+score);
        }
        input.close();
    }
}
