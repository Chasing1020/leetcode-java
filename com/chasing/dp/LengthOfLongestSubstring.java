package com.chasing.dp;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] dp = new int[s.length()];
        dp[0] = 1;
        int temp = 0, res = 0;
        for (int i = 1; i < s.length(); i++) {
            int index = map.getOrDefault(s.charAt(i), -1);
            map.put(s.charAt(i), i);
            temp = temp < i - index ? temp + 1 : i - index;
            res = Math.max(temp, temp);
        }
        return res;
    }

    public int lengthOfLongestSubstring1(String s) {
//        if (s.length()==0)
//            return 0;
        int head = 0, tail = 0, len = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (tail != s.length()) {
            int val = map.getOrDefault(s.charAt(tail), -1);
            if (val == -1) {
                head++;
            } else {
                tail++;
            }
            len = Math.max(tail-head,len);
        }
        return len;

    }
}
