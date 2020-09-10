package com.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={23,46,0,8,11,18};
        quickSort(arr,0,arr.length-1);
        System.out.println("排序后：");
        for(int i:arr){
            System.out.print(i+",");
        }

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int l = low;
        int h = high;
        int temp = arr[low];
        while (low < high) {
            while (low<high&&arr[high] >= temp) {
                high--;
            }
            arr[low] = arr[high];
            while (low<high&&arr[low] <= temp) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        int index = low;
        quickSort(arr,l,index-1);
        quickSort(arr,index+1,h);
    }
}
