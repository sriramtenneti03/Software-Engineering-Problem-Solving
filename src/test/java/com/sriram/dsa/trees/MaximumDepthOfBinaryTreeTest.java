package com.sriram.dsa.trees;
import com.sriram.dsa.model.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MaximumDepthOfBinaryTreeTest { @Test void measuresLongestRootToLeafPath() { assertEquals(3,MaximumDepthOfBinaryTree.maxDepth(new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7))))); assertEquals(0,MaximumDepthOfBinaryTree.maxDepth(null)); assertEquals(1,MaximumDepthOfBinaryTree.maxDepth(new TreeNode(1))); } }
