package com.sriram.dsa.trees;
import com.sriram.dsa.model.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class InvertBinaryTreeTest { @Test void swapsChildrenInPlace() { TreeNode left=new TreeNode(2,new TreeNode(1),new TreeNode(3)); TreeNode root=new TreeNode(4,left,new TreeNode(7)); assertSame(root,InvertBinaryTree.invert(root)); assertEquals(7,root.left.val);assertSame(left,root.right);assertEquals(3,left.left.val);assertNull(InvertBinaryTree.invert(null)); } }
