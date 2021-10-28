package com.chasing.dp;

import java.util.Arrays;

public class TranslateNum {
    public static void main(String[] args) {
        System.out.println(translateNum(25));
    }

    public static int translateNum(int num) {
        String str = String.valueOf(num);
        int[] dp = new int[str.length()];
        dp[0] = 1;
        dp[1] = 1 + check(str.charAt(0), str.charAt(1));
        for (int i = 0; i < str.length() - 2; i++) {
            dp[i + 2] = dp[i + 1] + check(str.charAt(i + 1), str.charAt(i + 2)) * dp[i];
        }
        System.out.println(Arrays.toString(dp));
        return dp[str.length() - 1];
    }

    public static int check(char i, char j) {
        int a = i - '0';
        int b = j - '0';
        return a * 10 + b >= 10 && a * 10 + b <= 25 ? 1 : 0;
    }
}
