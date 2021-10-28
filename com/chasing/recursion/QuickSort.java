package com.chasing.recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[]{1,23,423,5,4135,13,41,12};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int[] nums, int start, int end){
        if (start < end) {
            int index = partition(nums, start, end);
            sort(nums, start, index - 1);
            sort(nums, index + 1, end);
        }
    }
    public static int partition(int[] nums, int start, int end ){
        int pivot = nums[end];
        int i = start -1;
        for (int j = 0; j < end; j++) {
            if(nums[j]<=pivot){
                i++;
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        i++;
        int t = nums[i];
        nums[i] = nums[end];
        nums[end] = t;
        return i;
    }
}
