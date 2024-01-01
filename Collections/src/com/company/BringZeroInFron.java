package com.company;

public class BringZeroInFron {
    public static void main(String[] args) {
        int[] a = {55, 0, 21, 0, 63, 0, 45, 0};
        int j=0,i=0;
        outer: while(i<a.length){
            if(a[i]==0){
               j=i+1;
            while(j<a.length && a[j]==0){j++;}
            if(j<a.length){
            a[i]=a[j];
            a[j]=0;
            }
            else
                break outer;
            }
            i++;
        }
    }

}
