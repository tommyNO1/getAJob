package com.search;

public class BinarySearch {
    //基本二分查找
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) return arr[mid];
            else if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            }
        }
        return -1;
    }

    //寻找左侧边界的二分查找
    public int leftBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                right = mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid;
            }
        }
        if (left == nums.length) return -1;
        return nums[left] == target ? left : -1;
    }

    //寻找右侧边界
    public int rightBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                left = mid + 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid;
            }
        }
        if (left == 0) return -1;
        return nums[left - 1] == target ? left - 1 : -1;
    }
}
