package com.company;

public class BinarySearchAlgo {
    public static int binarySearch(int[] list,int item){
        int low=0;
        int high=list.length-1;
        while(low<=high){
        int mid=(low+high)/2;
        if(item<list[mid])
            high=mid-1;
        else if(item==list[mid])
            return mid;
        else
            low=mid+1;
        }
        return -low-1; //insertion point if value in not in the array
    }
}
