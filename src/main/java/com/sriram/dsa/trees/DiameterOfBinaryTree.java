package com.sriram.dsa.trees;

import com.sriram.dsa.model.TreeNode;

public final class DiameterOfBinaryTree {
    private DiameterOfBinaryTree() { }
    /** Computes height once per node and records the best through-node path. O(n) time, O(h) stack. */
    public static int diameter(TreeNode root) { int[] best = {0}; height(root, best); return best[0]; }
    private static int height(TreeNode node, int[] best) {
        if (node == null) return 0;
        int left = height(node.left, best), right = height(node.right, best);
        best[0] = Math.max(best[0], left + right); return 1 + Math.max(left, right);
    }
}
