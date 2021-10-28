package com.chasing.priorityqueue;

import java.util.PriorityQueue;

public class SlideWindow {
    public static void main(String[] args) {
        maxSlidingWindow(new int[]{9,10,9,-7,-4,-8,2,-6},5);

    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a,b)->nums[b]==nums[a]?a-b:nums[b]-nums[a]
        );
        int[] res = new int[nums.length-k+1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (pq.size() < k) {
                pq.offer(i);
                if (pq.size() == k) {
                    res[index++] = nums[pq.peek()];
                }
            } else {
                pq.offer(i);
                if (pq.peek() <= i-k) {
                    pq.poll();
                }
                res[index++] = nums[pq.peek()];
            }
        }
        return res;
    }
}
