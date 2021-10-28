package com.chasing.sort;


import java.util.Arrays;

public class Selection {
    public static void sort(Comparable [] a) {

       int N=a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
                if (a[j].compareTo(a[min])<0){
                    min = j;
                }
                Comparable t = a[i];
                a[i] = a[min];
                a[min] = t;
            }
        }
    }


    public static void main(String[] args) {
        Integer[] a = new Integer[]{1,23,4,1235,1,512,54,3,23};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

}
