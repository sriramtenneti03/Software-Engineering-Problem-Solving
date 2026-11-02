package com.sriram.dsa.trees;

import com.sriram.dsa.model.TreeNode;

public final class LowestCommonAncestorOfBST {
    private LowestCommonAncestorOfBST() { }
    /** Walks toward both keys until the paths split. O(h) time, O(1) space. */
    public static TreeNode find(TreeNode root, TreeNode first, TreeNode second) {
        int low = Math.min(first.val, second.val), high = Math.max(first.val, second.val);
        while (root != null && (root.val < low || root.val > high)) root = root.val < low ? root.right : root.left;
        return root;
    }
}
