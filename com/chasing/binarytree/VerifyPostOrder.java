package com.chasing.binarytree;

public class VerifyPostOrder {
    public static void main(String[] args) {
        int[] ints = new int[]{3, 5, 4, 6, 7, 10, 9};
//        System.out.println(verifyPostorder(ints));
    }

//    public static boolean verifyPostorder(int[] postorder) {
//        if (postorder.length == 0) {
//            return true;
//        }
//        boolean flag = true;
//        int root = postorder[postorder.length - 1];
//        int head = 0, tail = postorder.length - 1;
//        while (head < postorder.length - 1 && postorder[head] < root) head++;
//        while (tail >= 0 && postorder[tail] > root) tail--;
//        flag = head == tail + 1;
//        boolean left = verifyPostorder(Arrays.copyOfRange(postorder, tail + 1, postorder.length-1));
//        return right && left && flag;
//    }

    boolean recur(int[] postorder, int i, int j) {
        if(i >= j) return true;
        int p = i;
        while(postorder[p] < postorder[j]) p++;
        int m = p;
        while(postorder[p] > postorder[j]) p++;
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}