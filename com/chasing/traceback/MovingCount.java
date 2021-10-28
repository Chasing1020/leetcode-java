package com.chasing.traceback;

public class MovingCount {
    public static void main(String[] args) {
        System.out.println(getCount(35, 37));
        System.out.println(movingCount(99, 99, 17));
    }

    public static int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return movingCount(m,n,k,0,0,visited);
    }

    public static int movingCount(int m, int n, int k, int i, int j, boolean[][] visited) {
        int sum = 0;
        if (check(m, n, k, i, j, visited)) {
            visited[i][j] = true;
            sum = 1 + movingCount(m, n, k, i + 1, j, visited) +
                    movingCount(m, n, k, i, j + 1, visited) +
                    movingCount(m, n, k, i - 1, j, visited) +
                    movingCount(m, n, k, i, j - 1, visited);
        }

        return sum;
    }

    public static boolean check(int m, int n, int k, int i, int j, boolean[][] visited) {
        return i >= 0 && i < m && j >= 0 && j < n && !visited[i][j] && getCount(i, j) <= k;
    }

    public static int getCount(int n, int m) {
        int sum = 0;
        while (n > 0 || m > 0) {
            sum += n % 10;
            sum += m % 10;
            n /= 10;
            m /= 10;
        }
        return sum;
    }
}
