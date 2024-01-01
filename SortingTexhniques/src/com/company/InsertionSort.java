package com.company;

public class InsertionSort {

    public static void main(String[] args) {
    int []list={1,5,3,6,8,4};
    insetionSort(list);
    for(int x:list)
        System.out.println(x);
    }

    public static void insetionSort(int[] list){
        for(int i=0;i<list.length;i++){
            int currentElement=list[i];
            int k;
            for(k=i-1;k>=0 && list[k]>currentElement;k--){
                list[k+1]=list[k];
            }
            list[k+1]=currentElement;
        }
    }
}
