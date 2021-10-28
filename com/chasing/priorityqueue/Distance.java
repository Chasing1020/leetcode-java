package com.chasing.priorityqueue;

import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] points, int k) {

        HashMap<int[], Double> map = new HashMap<>();
        for (int[] point : points) {
            map.put(point, distance(point));
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a,b) -> (int) (map.get(a)-map.get(b))
        );
        for (int[] point : points) {
            pq.offer(point);
        }
        int[][] res = new int[k][];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }
        return res;
    }
    public Double distance(int[] a) {
        return Math.sqrt(a[0]*a[0]+a[1]*a[1]);
    }
}
public class Distance {

}
