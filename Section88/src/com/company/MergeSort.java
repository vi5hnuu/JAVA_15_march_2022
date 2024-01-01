package com.company;

public class MergeSort {
    public static void main(String[] args){
        int arr[]={15,6,9,12,16,7};
        int n=arr.length;
        MergeSort mergeSort=new MergeSort();
        mergeSort.splitAndMerge(arr,0,n-1);
    }

    public void splitAndMerge(int arr[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            splitAndMerge(arr,low,mid);
            splitAndMerge(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public void merge(int arr[],int low,int mid,int high){

    }
}
