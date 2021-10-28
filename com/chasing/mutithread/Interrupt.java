package com.chasing.mutithread;

public class Interrupt {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        });
        t.start();
        t.interrupt();
        System.out.println(Thread.currentThread().getName());
    }
}
