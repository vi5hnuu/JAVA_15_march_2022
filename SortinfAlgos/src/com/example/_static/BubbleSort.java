package com.example._static;

public class BubbleSort {
    public void bubbleSort(int[] list){
        boolean needNextPass=true;
        for(int k=1;k<list.length && needNextPass;k++){//passes
            needNextPass=false;
            for(int i=0;i<list.length-k;i++){
                if(list[i]>list[i+1]){
                    needNextPass=true;
                    int temp=list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                }
            }
        }
    }
}
