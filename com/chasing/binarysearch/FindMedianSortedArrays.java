package com.chasing.binarysearch;

public class FindMedianSortedArrays {
    public static void main(String[] args) {

    }

//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//    }

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
            // if (right-left==1 || left-right==1){
            //     if(nums[left]==target) return left;
            //     if(nums[right]==target) return right;
            //     else return right;

        }
        return left;
    }
}
