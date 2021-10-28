package com.chasing.greedy;

public class CuttingRope {
    public static void main(String[] args) {
        System.out.println(quickPow(3, 40, (int) 1e9 + 7));
        System.out.println(3>>1);
    }

    public static int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int a = n / 3, b = n % 3;
        int mod = 1000000007;
        if (b == 0) return (int)quickPow(3, a, mod);
        if (b == 1) return (int)(quickPow(3, a - 1, mod) * 4 % mod);
        return (int)quickPow(3, a, mod) * 2 % mod;
    }

    public static long quickPow(long m, long n, int mod) {
        long res = 1;
        if (m == 0) return 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * m % mod;
            }
            n = n >> 1;
            m = (m * m) % mod;
        }
        return res % mod;
    }
}
