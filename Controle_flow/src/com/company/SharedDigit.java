package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y){
        if((x>=10 && x<=99 && y>=10 && y<=99)){
            int digit=0;
            while(x!=0){
                digit=x%10;
                x/=10;

                int temp_y=y;
                while(temp_y!=0){
                    int temp=temp_y%10;
                    temp_y/=10;
                    if(temp==digit)
                        return true;
                }
            }
            return false;
        }
        return false;
    }
}
