package com.chasing.extra;

public class ComputeArea {
    public static void main(String[] args) {
    }

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int l = Math.max(ax1, bx1);
        int r = Math.min(ax2, bx2);
        int b = Math.max(ay1, by1);
        int t = Math.min(ay2, by2);
        return (r > l ? r - l : 0) * (t > b ? t - b : 0);
    }
}
