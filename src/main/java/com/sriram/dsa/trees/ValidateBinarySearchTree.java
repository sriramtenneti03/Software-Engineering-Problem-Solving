package com.sriram.dsa.trees;

import com.sriram.dsa.model.TreeNode;

public final class ValidateBinarySearchTree {
    private ValidateBinarySearchTree() { }
    /** Carries exclusive long bounds down the tree. O(n) time, O(h) call stack. */
    public static boolean isValid(TreeNode root) { return valid(root, Long.MIN_VALUE, Long.MAX_VALUE); }
    private static boolean valid(TreeNode node, long low, long high) {
        if (node == null) return true;
        return node.val > low && node.val < high && valid(node.left, low, node.val) && valid(node.right, node.val, high);
    }
}
