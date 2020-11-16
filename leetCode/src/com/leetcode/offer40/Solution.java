package com.leetcode.offer40;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 1, 6, 2, 7, 3, 8};
        int k = 1;
        int[] res = getLeastNumbers(arr, k);
        for (int i = 0; i < k; i++) {
            System.out.print(res[i] + ",");
        }

    }

    public static int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            return new int[0];
        }
        int start = 0;
        int end = arr.length - 1;
        int index = partition(arr, start, end);
        while (index != k - 1) {
            if (index > k - 1) {
                end = index - 1;
                index = partition(arr, start, end);
            } else {
                start = index + 1;
                index = partition(arr, start, end);
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static int partition(int arr[], int low, int high) {
        int temp = arr[low];
        while (low < high) {
            while (arr[high] >= temp && low < high) {
                high--;
            }
            arr[low] = arr[high];
            while (arr[low] <= temp && low < high) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }
}
