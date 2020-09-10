package com.search;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = new int[]{1,2,2,4};
        System.out.println(binarySearch.binarySearch(nums,4));
        System.out.println(binarySearch.leftBound(nums,2));
        System.out.println(binarySearch.rightBound(nums,2));
    }
}
