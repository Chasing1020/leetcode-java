package com.chasing.extra;

public class SpiralOrder {
    public static void main(String[] args) {
    }

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int t = 0, b = matrix.length, l = 0, r = matrix[0].length, index = 0;
        int[] res = new int[(b + 1) * (r + 1)];
        while (true) {
            for (int i = l; i <= r; i++) {
                res[index++] = matrix[l][t];
            }
            if (++t > b) {
                break;
            }
            for (int i = t; i <= b; i++) {
                res[index++] = matrix[i][r];
            }
            if (--r < l) {
                break;
            }
            for (int i = r; i >= l; i--) {
                res[index++] = matrix[b][i];
            }
            if (--b < t) {
                break;
            }
            for (int i = b; i >= 0; i--) {
                res[index++] = matrix[i][l];
            }
            if (++l > r) {
                break;
            }
        }
        return res;
    }
}
