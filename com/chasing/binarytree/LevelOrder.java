package com.chasing.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public List<List<Integer>> l;

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        while(!q.isEmpty()){

            System.out.println(q.poll());
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> l = new ArrayList<>();
        if (root == null)
            return l;
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                arrayList.add(node.val);
                if (node.right != null) {
                    q.offer(node.right);
                }
                if (node.left != null) {
                    q.offer(node.right);
                }

            }
            l.add(arrayList);
        }
        return l;
    }
}
