package com.chasing.traceback;

import java.util.Arrays;

public class MatrixRoute {

    public static void main(String[] args) {
        char[][] a = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCE";
        char[][] copy = Arrays.copyOf(a, a.length);
        System.out.println(exist(copy, word));
    }

    public static boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (can(board, words, i, j, 0)) return true;
            }
        }

        return false;
    }

    public static boolean can(char[][] board, char[] word, int i, int j, int k) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word[k]) {
            return false;
        }
        if (k == word.length - 1) {
            return true;
        }
        board[i][j] = '\0';
        boolean res = can(board, word, i + 1, j, k + 1) ||
                can(board, word, i, j + 1, k + 1) ||
                can(board, word, i - 1, j, k + 1) ||
                can(board, word, i, j - 1, k + 1);
        board[i][j] = word[k];
        return res;
    }
}

