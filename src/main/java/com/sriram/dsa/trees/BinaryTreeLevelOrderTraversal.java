package com.sriram.dsa.trees;

import com.sriram.dsa.model.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public final class BinaryTreeLevelOrderTraversal {
    private BinaryTreeLevelOrderTraversal() { }
    /** Processes one queue width per level. O(n) time and O(n) space. */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>(); if (root == null) return levels;
        Queue<TreeNode> queue = new ArrayDeque<>(); queue.add(root);
        while (!queue.isEmpty()) {
            int width = queue.size(); List<Integer> level = new ArrayList<>(width);
            for (int i = 0; i < width; i++) {
                TreeNode node = queue.remove(); level.add(node.val);
                if (node.left != null) queue.add(node.left); if (node.right != null) queue.add(node.right);
            }
            levels.add(level);
        }
        return levels;
    }
}
