package com.chasing.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[]{3, 145, 1235, 3, 547, -21, 234, 2};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (end <= start) {
            return;
        }
        int low = start;
        int high = end;
        int pivot = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivot)
                high--;
            arr[low] = arr[high]; // 将小于 pivot 的数放在低位
            while (low < high && arr[low] <= pivot)
                low++;
            arr[high] = arr[low]; // 将大于 pivot 的数放在高位
        }
        arr[low] = pivot;
        quickSort(arr, start, low - 1); // 递归排序左半部分
        quickSort(arr, low + 1, end); // 递归排序右半部分
    }
}
