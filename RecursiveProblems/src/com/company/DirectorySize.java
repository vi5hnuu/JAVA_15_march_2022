package com.company;

import java.util.Scanner;
import java.io.*;

public class DirectorySize {
    public static void main(String[] args) {
        System.out.println("ENter a directory of file :");
        Scanner input=new Scanner(System.in);
        String directory=input.nextLine();

        System.out.println(getSize(new File(directory))/(1024*1024)+" Mb");
    }

    public static long getSize(File file){
        long size=0;
        if(file.isDirectory()){
            File[] files=file.listFiles();
            for(int i=0;files!=null && i<files.length;i++){
                size+=getSize(files[i]);
            }
        }else
            size+=file.length();
    return size;
    }
}
