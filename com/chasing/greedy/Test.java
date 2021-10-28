package com.chasing.greedy;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] ints = {4, 1, -1, 2, -1, 2, 3};
        System.out.println(Arrays.toString(Objects.requireNonNull(topKFrequent(ints, 2)).toArray()));
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        if (k > nums.length) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for (Integer key : map.keySet()) {
            if (q.size() < k) {
                q.offer(key);
            } else if (map.get(key) > map.get(q.peek())) {
                q.poll();
                q.offer(key);
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!q.isEmpty()) {
            res.add(q.poll());
        }
        return res;
    }
}
