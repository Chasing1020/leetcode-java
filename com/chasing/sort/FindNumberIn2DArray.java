package com.chasing.sort;

public class FindNumberIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int[] a = new int[10000];
        int i = 0, j = matrix[0].length-1;
        int target = 9;
        while (i < matrix.length && j > 0) {
            if (matrix[i][j] < target) {
                i++;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                System.out.println("found");
                break;
            }
        }

    }
}
