package com.chasing.binarytree;

public class CountNodes {
    public static void main(String[] args) {

    }
    class Solution {
        // 时间复杂度O(logn * logn)
        public int countNodes(TreeNode root) {
            if(root == null){
                return 0;
            }
            int left = countLevel(root.left);
            int right = countLevel(root.right);
            if(left == right){
                return countNodes(root.right) + (1<<left);
            }else{
                return countNodes(root.left) + (1<<right);
            }
        }
        private int countLevel(TreeNode root){
            int level = 0;
            while(root != null){
                level++;
                root = root.left;
            }
            return level;
        }
    }
}
