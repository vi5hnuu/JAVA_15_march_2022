package com.company;

public class MergeSort {

    public static void  main(String[] args) {
        int arr[] = {15, 6, 9, 12, 16, 7};
        int n = 6;
        MergeSort mergeSort = new MergeSort();
        mergeSort.splitAndMerge(arr, 0, n - 1);
        for(int x:arr)
            System.out.print(x+" ");
    }


    public void splitAndMerge(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            splitAndMerge(arr, low, mid);
            splitAndMerge(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public void merge(int arr[], int low, int mid, int high) {
        int i = low, h = low, j = mid + 1, k;
        int[] temp = new int[arr.length];
        while (h <= mid && j <= high) {
            if (arr[h] <= arr[j]) {
                temp[i] = arr[h];
                h++;
            } else {
                temp[i] = arr[j];
                j++;
            }
            i++;
        }
        if (h > mid) {
            for (k = j; k <= high; k++) {
                temp[i] = arr[k];
                i++;
            }
        } else {
            for (k = h; k <= mid; k++) {
                temp[i] = arr[k];
                i++;
            }
        }
        for(int ii=low;ii<=high;ii++)
            arr[ii]=temp[ii];
    }
}
