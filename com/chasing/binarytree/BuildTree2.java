package com.chasing.binarytree;

public class BuildTree2 {
    public static void main(String[] args) {
        TreeNode node = buildTree(new int[]{1,2,3},
                new int[]{3,2,1});
        Traverse(node);
    }
    public static void Traverse(TreeNode root) {
        if(root == null) return;
        Traverse(root.left);

        Traverse(root.right);
        System.out.println(root.val);
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
            if (preStart > preEnd || inStart > inEnd || inEnd > inorder.length || preEnd> preorder.length) {
            return null;
        }
//        if (preStart == preEnd) return new TreeNode(preorder[preStart]);
//        if (inStart == inEnd) return new TreeNode(inorder[inStart]);
        int index = inStart;
        TreeNode root = new TreeNode(preorder[preStart]);
        while (inorder[index] != preorder[preStart]) index++;
        root.left = buildTree(preorder, inorder, preStart + 1, preStart+index, inStart, index - 1);
        root.right = buildTree(preorder, inorder, index + 1, preEnd, index + 1, inEnd);
        return root;
    }
}
