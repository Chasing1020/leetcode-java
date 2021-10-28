package com.chasing.binarytree;


import java.util.Arrays;

public class BuildTree {
    public static void main(String[] args) {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        TreeNode root = buildTree(preorder,inorder);

        traverse(root);
    }
    public static void traverse(TreeNode root){
        if (root == null) return;
        traverse(root.left);
        traverse(root.right);
        System.out.println(root.val);
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(preorder[0]);
        if (preorder.length == 0 ) return null;
        if (preorder.length == 1 ) return root;
        for (int i = 0; i < inorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                root.left = buildTree(Arrays.copyOfRange(preorder,1,1+i),
                            Arrays.copyOfRange(inorder,0,i));
                root.right = buildTree(Arrays.copyOfRange(preorder,1+i,preorder.length),
                        Arrays.copyOfRange(inorder,1+i,inorder.length));
            }
        }
        return root;
    }
}
