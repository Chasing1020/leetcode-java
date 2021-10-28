package com.chasing.dp;

public class DicesProbability {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.dicesProbability(2);
    }
}

class Solution {
    public double[] dicesProbability(int n) {
        double[] dp = new double[5 * n + 1];
        for (int i = 0; i < 6; i++) {
            dp[i] = 1.0 / 6;
        }
        for (int i = 1; i < n; i++) {
            double[] temp = new double[5 * n + 1];
            for (int j = 0; j < 5 * (n-1) + 1; j++) {
                for (int k = 0; k < 6 ; k++) {
                    temp[j + k] += dp[j]*1.0/6;
                }
            }
            dp = temp;
        }
        return dp;
    }
}