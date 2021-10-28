package com.chasing.extra;

import java.util.Arrays;
import java.util.HashMap;

public class Exchange {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,4,5,6,7};
        System.out.println(Arrays.toString(exchange(nums)));

    }
    public static int[] exchange(int[] nums) {
        int i = 0, j = nums.length-1;
        while (i < j) {
            while ((nums[i] & 1) == 1){
                i++;
            }
            while ((nums[j] & 1) == 0) {
                j--;
            }
            if (i < j){
                swap(nums, i, j);
            }
        }
        return nums;
    }
    public static void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
