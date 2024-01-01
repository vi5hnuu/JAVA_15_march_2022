package com.company;

public class BubbleSort {
    public static void main(String[] args){
        int []list={1,5,3,6,8,4};
        bubbleSort(list);
        for(int x:list)
            System.out.println(x);
    }
//    public static void bubbleSort(int []list){
//        for(int k=1;k<list.length;k++){
//            for(int i=0;i<list.length-k;i++){
//                if(list[i]>list[i+1]){
//                    int temp=list[i];
//                    list[i]=list[i+1];
//                    list[i+1]=temp;
//                }
//            }
//        }
//    }

    public static void bubbleSort(int []list){
        for(int k=1;k<list.length;k++){
            boolean flag=false;
            for(int i=0;i<list.length-k;i++){
                if(list[i]>list[i+1]){
                    int temp=list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                    flag=true;
                }
            }
            if(!flag)
                break;
        }
    }
}
