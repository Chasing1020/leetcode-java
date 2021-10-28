package com.chasing.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.PriorityQueue;

public class GetLeastNumbers {
    @Test
    public void Test() {

        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        System.out.println(Arrays.toString(pQueue.toArray()));
        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getLeastNumbers(new int[]{3, 2, 1}, 2)));
    }
    public static int[] getLeastNumbers(int[] arr, int k) {

            PriorityQueue<Integer> pq = new PriorityQueue<>((num1, num2) -> num2 - num1);


            for (int num: arr) {
                if (pq.size() < k) {
                    pq.offer(num);
                } else if (num < pq.peek()) {
                    pq.poll();
                    pq.offer(num);
                }
            }
            int[] res = new int[k];
            for (int i = 0; i < k; i++) {
                res[i]=pq.poll();
            }
            return res;

    }
}
