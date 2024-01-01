package com.company;

import java.io.*;

public class TestDataStream {
    public static void main(String[] args) throws IOException{
        try(DataOutputStream outputStream=new DataOutputStream(new FileOutputStream("temp.dat"))){
            outputStream.writeUTF("John");
            outputStream.writeDouble(85.5);
            outputStream.writeUTF("Susan");
            outputStream.writeDouble(185.5);
            outputStream.writeUTF("Kim");
            outputStream.writeDouble(105.05);
        }
        try(
                DataInputStream inputStream=new DataInputStream(new FileInputStream("temp.dat"))){
            System.out.println(inputStream.readUTF()+" "+inputStream.readDouble());
            System.out.println(inputStream.readUTF()+" "+inputStream.readDouble());
            System.out.println(inputStream.readUTF()+" "+inputStream.readDouble());
                }

    }
}
