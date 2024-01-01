package com.company;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccesssFile {
    public static void main(String[] args) throws IOException {
        try(
                RandomAccessFile input=new RandomAccessFile("input.dat","rw");
                ){
            input.setLength(0);
            for(int i=0;i<200;i++)
                input.writeInt(i);

            System.out.println("Current file length "+input.length());
            input.seek(0);
            System.out.println("The first number is "+input.readInt());
            System.out.println("The second number is "+input.readInt());
            //tenth number is
            input.seek(4*9);//seek from start
            System.out.println("The tenth number is "+input.readInt());
            input.writeInt(555);
            input.seek(input.length());
            input.writeInt(999);
            System.out.println("Current file length "+input.length());
            input.seek(10*4);
            System.out.println("Eleventh number is "+input.readInt());
        }
    }
}
