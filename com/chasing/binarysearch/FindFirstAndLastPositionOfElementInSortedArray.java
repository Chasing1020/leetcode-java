package com.chasing.binarysearch;

public class FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args) {
        System.out.println(searchRange(new int[]{2,2}, 8));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ret = new int[2];
        ret[0] = leftBound(nums, target);
        ret[1] = rightBound(nums, target);
        return ret;
    }

    public static int leftBound(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (left < 0 || left >= nums.length || nums[left] != target) return -1;
        return left;
    }

    public static int rightBound(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (right < 0 || right >= nums.length || nums[right] != target) return -1;
        return right;
    }
}
