package com.chasing.mutithread;

import java.util.concurrent.atomic.AtomicInteger;

public class Process {
    private static volatile AtomicInteger count;

    public static void main(String[] args) throws InterruptedException {
        count = new AtomicInteger(100000);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    sell(1);
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(count.get()); // 0
    }

    public static void sell(int x) {
        count.getAndAdd(-x);
//        for (;;) {
//            int cur = count.get();
//            int next = cur - x;
//            if (count.compareAndSet(cur, next))
//                break;
//        }
    }
}

