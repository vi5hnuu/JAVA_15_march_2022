package com.company;
import java.io.*;

public class Copy {
    public static void main(String[] args)throws IOException {
        if(args.length!=2){
            System.out.println("Usage : java copy sourcefile targetfile");
            System.exit(1);
        }
        File sourceFile=new File(args[0]);
        if(!sourceFile.exists()){
            System.out.println("Source file "+args[0]+" does not exist.");
            System.exit(2);
        }
        File targetFile=new File(args[1]);
        if(targetFile.exists()){
            System.out.println("Target File "+args[1]+" already exists");
            System.exit(3);
        }
        try(
            BufferedInputStream input=new BufferedInputStream(new FileInputStream(sourceFile));
            BufferedOutputStream output=new BufferedOutputStream(new FileOutputStream(targetFile));
        ){
            int r,numberOfBytesCopied=0;
            while ((r=input.read())!=-1){ //read from buffer
                output.write((byte)r); //write in buffer
                numberOfBytesCopied++;
            }
            System.out.println(numberOfBytesCopied+" bytes copied");
        }

        }
    }
