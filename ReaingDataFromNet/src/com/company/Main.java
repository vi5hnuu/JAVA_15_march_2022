package com.company;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        String url_address="http://liveexample.pearsoncmg.com/data/Lincoln.txt";
        try{
            URL url=new URL(url_address);
            int count=0;
            Scanner input=new Scanner(url.openStream());
            while(input.hasNext()){
                String line=input.nextLine();
                count+=line.length();
            }
            System.out.println("The file size is "+count+" characters");
        }
        catch (MalformedURLException ex){
            ex.printStackTrace();
        }
        catch (IOException ex){
            System.out.println("I/O errors: no such file");
        }


    }
}
