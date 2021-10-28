package com.chasing.extra;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatNumber {
    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 1, 0, 2, 5, 3};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else map.put(i, 1);
            if (map.containsKey(i) && map.get(i) > 1)
                System.out.println(i);
        }
    }
//    public int findRepeatNumber(int[] nums) {
//
//    }
}
