package com.chasing.binarytree;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}

public class TreeToDoublyList {
    public static void main(String[] args) {

    }
    Node pre,head;
//    public Node treeToDoublyList(Node root) {
//
//    }
    public void inOrderTraverse(Node cur){
        if (cur == null) return ;
        inOrderTraverse(cur.left);

        if(pre != null) pre.right = cur;
        else head = cur;
        cur.left = pre;
        pre = cur;

        inOrderTraverse(cur.right);
    }
}
