package com.chasing.binarytree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PostOrderTraversal {
    public static void main(String[] args) {

    }
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            Deque<TreeNode> stack = new LinkedList<>();
            LinkedList<Integer> ans = new LinkedList<>();
            if (null == root) return ans;
            stack.addFirst(root);
            while (!stack.isEmpty()) {
                TreeNode node = stack.removeFirst();
                ans.addFirst(node.val);
                if (null != node.left) {
                    stack.addFirst(node.left);
                }
                if (null != node.right) {
                    stack.addFirst(node.right);
                }
            }
            return ans;
        }
    }
}
