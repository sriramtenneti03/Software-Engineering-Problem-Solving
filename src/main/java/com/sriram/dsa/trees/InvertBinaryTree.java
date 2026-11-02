package com.sriram.dsa.trees;

import com.sriram.dsa.model.TreeNode;

public final class InvertBinaryTree {
    private InvertBinaryTree() { }
    /** Swaps each node's children in place. O(n) time, O(h) call stack. */
    public static TreeNode invert(TreeNode root) {
        if (root == null) return null;
        TreeNode left = root.left; root.left = invert(root.right); root.right = invert(left); return root;
    }
}
