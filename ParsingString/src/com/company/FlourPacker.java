package com.company;

public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(goal<0)
            return false;

        int count_big=0;
        while(count_big+5<=bigCount*5 && (count_big+5)<=goal)
            count_big+=5;


        int count_small=goal-count_big;
        if((count_big+count_small)>=goal && count_small<=smallCount)
            return true;
        else
            return false;

    }
}
