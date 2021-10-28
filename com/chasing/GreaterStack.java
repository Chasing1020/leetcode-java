package com.chasing;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class GreaterStack {
    public static void main(String[] args) {
//        int[] a = new int[Integer.MAX_VALUE-1];
//        int[] b = new int[Integer.MAX_VALUE>>1];
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (stack.size() != 0 && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                ans[index] = i - index;
            }
            stack.push(i);
        }
        return ans;
    }
}
