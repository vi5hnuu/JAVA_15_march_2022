package com.company;

public class GreatestCommonDivisor {
    public static int getGreatestcommonDivisor(int first,int second){
        if(first<10 || second<10)
            return -1;
        int biggest=first>second ? first :second;
        while(biggest!=0){
            if(first%biggest==0 && second%biggest==0)
                return biggest;
            else
                biggest--;
        }
        return 1; //redudent
    }
}
