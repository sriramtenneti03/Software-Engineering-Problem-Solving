package com.sriram.dsa.trees;

import com.sriram.dsa.model.TreeNode;

public final class MaximumDepthOfBinaryTree {
    private MaximumDepthOfBinaryTree() { }
    /** Recursively takes the deeper subtree. O(n) time, O(h) call stack. */
    public static int maxDepth(TreeNode root) { return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right)); }
}
