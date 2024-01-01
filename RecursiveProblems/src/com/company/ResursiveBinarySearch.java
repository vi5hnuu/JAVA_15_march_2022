package com.company;

public class ResursiveBinarySearch {
    public static int binarySearch(int[] list,int key){
        int low=0;
        int high=list.length-1;
        return binarySearch(list,key,low,high);
    }
    private static int binarySearch(int [] list,int key,int low,int high){
        if(low>high)
            return -low-1;
        int mid=(low+high)/2;
        if(key<list[mid])
            return binarySearch(list,key,low,mid-1);
        else if(key==list[mid])
            return mid;
        else
            return binarySearch(list,key,mid+1,high);
    }
}
