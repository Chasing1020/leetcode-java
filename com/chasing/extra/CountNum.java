package com.chasing.extra;

import java.util.ArrayList;
import java.util.List;

public class CountNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.findContinuousSequence(9);
    }
}

class Solution {
    public int[][] findContinuousSequence(int target) {
        if (target < 3) return null;
        int left = 1, right = 2;
        int maxLength = Integer.MIN_VALUE;
        List<int[]> ret = new ArrayList<>();
        while (right < target) {
            if ((right + left) * (right - left + 1) / 2 < target) {
                right++;
            } else if ((right + left) * (right - left + 1) / 2 > target) {
                left++;
            } else {
                int[] temp = new int[right - left + 1];
                maxLength = Math.max(maxLength, right - left + 1);
                for (int i = 0; i < right - left + 1; i++) {
                    temp[i] = left + i;
                }
                ret.add(temp);
                right++;
            }
        }
        // int[][] ans = new int[ret.size()+1][maxLength+1];
        // for (int i = 0; i < ret.size(); i++) {
        //     for (int j = 0; j < ret.get(i).length; j++) {
        //         ans[i][j] = ret.get(i)[j];
        //     }
        // }
        return ret.toArray(new int[ret.size()][]);
    }
}