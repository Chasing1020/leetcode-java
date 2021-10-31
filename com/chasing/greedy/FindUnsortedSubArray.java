package com.chasing.greedy;

public class FindUnsortedSubArray {
    public static void main(String[] args) {

    }

    class Solution {
        public int findUnsortedSubarray(int[] nums) {
            int len = nums.length;
            int min = nums[len - 1];
            int max = nums[0];
            int begin = 0, end = -1;
            for (int i = 0; i < len; i++) {
                if (nums[i] < max) {
                    end = i;
                } else {
                    max = nums[i];
                }
                if (nums[len - i - 1] > min) {
                    begin = len - i - 1;
                } else {
                    min = nums[len - i - 1];
                }
            }
            return end - begin + 1;
        }
    }
}
