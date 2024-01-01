package com.company;

//note always call super.mthodname
//because if you override a method and just call a methodname(); it will call the  overridden method
//but eith super.methodname it will call the nonoverride just like in c++;(no super in c++ btw)


import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println(Math.max(5,6)); //+long,float,double
//        System.out.println(Math.min(5,6)); //+long,float,double
//        System.out.println(Math.abs(-5)); //+long,float,double
//        System.out.println(Math.pow(2.5,2)); //double only(covers all)
//        System.out.println(Math.sqrt(25)); //double only(covers all)
//        System.out.println(Math.toDegrees(Math.PI/2)); //double only(covers all)
//        System.out.println(Math.toRadians(90.0)); //double only(covers all)
//        System.out.println(Math.sin(90.0)); //double only(covers all),same for cos,tan etc
//        System.out.println(Math.sinh(90.0)); //double only(covers all)
//        System.out.println(Math.asin(1)); //double only(covers all)
//        System.out.println(Math.addExact(2,3));
//        System.out.println(Math.addExact(2L,3L));
//        System.out.println(Math.cbrt(125));//double only(covers all)
//        System.out.println(Math.decrementExact(Integer.MAX_VALUE));
//        System.out.println(Math.incrementExact(Integer.MAX_VALUE)); //exception
//        System.out.println(Math.exp(2));
//        System.out.println(Math.log(10));
//        System.out.println(Math.log10(10));
//        System.out.println(Math.ceil(4.6));
//        System.out.println(Math.floor(4.6));
//        System.out.println(Math.round(4.6));
//        System.out.println(Math.round(4.4)); //parameter->float,double=>return int,long
//        System.out.println(Math.rint(3.5));
//        System.out.println(Math.rint(2.5));
//        System.out.println('2'+'1'); //49+50
//        System.out.println('2'+1); //50+1
//        System.out.println('2'+"1"); //21
//        System.out.println("2"+'1'); //21

//        char ch='5';
//        if(ch>='A' && ch<='Z')
//            System.out.println("Uppercase");
//        else if(ch>='a' && ch<=122)
//            System.out.println("Lowercase");
//        else if(ch>=48 && ch<='9')
//            System.out.println("Numeric");
//        else
//            System.out.println("Other");

//        char c='A';
//        System.out.println(Character.isAlphabetic(c));
//        System.out.println(Character.isLetterOrDigit(c));
//        System.out.println(Character.isUpperCase('A'));
//        System.out.println(Character.toLowerCase(c));
//        System.out.println(Character.toUpperCase(c));
//        System.out.println(Character.toString(c));

//        String name=" Vishnu kumar ";
//        System.out.println(name+" length :"+name.length());
//        System.out.println(name+" charAt(1) :"+name.charAt(1));
//        System.out.println(name+" toLowerCase :"+name.toLowerCase());
//        System.out.println(name+" toUppercase :"+name.toUpperCase());
//        System.out.println(name+" trim :"+name.trim());
//        System.out.println(name+" strip :"+name.strip());
//        System.out.println(name+" stripLeading :"+name.stripLeading());
//        System.out.println(name+" stripTraling :"+name.stripTrailing());
//        System.out.println(name+" isEmpty :"+name.isEmpty());
//        System.out.println(name+" equals :"+name.equals(" vishnu kumar "));
//        System.out.println("Vishnu"+" compareTo :"+"Vishnu".compareTo("Vishnu"));
//        System.out.println("Vishnu"+" compareTo :"+"Vishnu".compareTo("vishnu"));
//        System.out.println("Vishnu"+" compareToIgnoreCase :"+"Vishnu".compareToIgnoreCase("vishnu"));
//        System.out.println(name+" equalsIgnoreCase :"+name.equalsIgnoreCase(" Vishnu kumar "));
//        System.out.println("Vishnu"+" startsWith :"+"Vishnu".startsWith("V"));
//        System.out.println("Vishnu"+" startsWith :"+"Vishnu".startsWith("Vi"));
//        System.out.println("Vishnu"+" startsWith :"+"Vishnu".startsWith("sh",2));
//        System.out.println("Vishnu"+" endsWith :"+"Vishnu".endsWith("u"));
//        System.out.println("Vishnu"+" endsWith :"+"Vishnu".endsWith("nu"));
//        System.out.println("Vishnu"+" endsWith :"+"Vishnu".lastIndexOf("i"));
//        System.out.println("Vishnu"+" endsWith :"+"Vishnu".lastIndexOf("i",1));
//        System.out.println("Vishnu"+" endsWith :"+"Vishnu".lastIndexOf("ish",1));
//        System.out.println("Vishnu"+" endsWith :"+"Vishnu".lastIndexOf("ish"));
//        System.out.println("     "+" endsWith :"+"    ".isBlank());
//        System.out.println("     "+" endsWith :"+"    ".isEmpty());
//        System.out.println("Vishnu"+" endsWith :"+"Vishnu".substring(2));
//        System.out.println("Vishnu"+" endsWith :"+"Vishnu".substring(2,5));
//        System.out.println("Vishnu"+" endsWith :"+"Vishnu".repeat(2));
//        System.out.println("Vishnu".concat(" kumar"));
//        System.out.println("vishnu".contains("shn"));
        ///////////////////////////////////////////////
//        Scanner scn=new Scanner(System.in);
//        String a,b,c;
//        a=scn.next();
//        b=scn.next();
//        c=scn.next();
//        scn.close();
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

    ////////////////////////////////////////////////////
//        System.out.println("Vishnu".indexOf("s"));
//        System.out.println("Vishnu".indexOf('s'));
//        System.out.println("Vishnu".indexOf('s',2));
//        System.out.println("Vishnu".indexOf("sh"));
//        System.out.println("Vishnu".indexOf("i",1));
//        System.out.println("Vishnu".indexOf("sh",2));
//        System.out.println("Vishnu".lastIndexOf('s',2));
//        System.out.println("Vishnu".lastIndexOf("sh"));
//        System.out.println("Vishnu".lastIndexOf("sh",3));

        ///////////////////////////////////////////////
//        int intValue=Integer.parseInt("25");
//        System.out.println(intValue);

        ///////////////////////////////////////////////
        //GuessBirthday.java
//        GuessBirthday personA=new GuessBirthday();
//        System.out.println(personA.GuessDateOfBirth());

        ///////////////////////////////////////////////

    }
}
