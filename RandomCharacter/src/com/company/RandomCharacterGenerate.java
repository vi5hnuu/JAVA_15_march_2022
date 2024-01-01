package com.company;

public class RandomCharacterGenerate {
    public static char getRandomCharacter(char ch1,char ch2){
        if(ch1<ch2)
        return (char)(ch1+Math.random()*(ch2-ch1+1));
        else
            return (char)(ch2+Math.random()*(-ch2+ch1+1));
    }
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a','z');
    }
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A','Z');
    }
    public static char getRandomDigitCharater(){
        return getRandomCharacter('0','9');
    }
    public static char getRandomCharater(){
        return getRandomCharacter('\u0000','\uFFFF');
    }
}
