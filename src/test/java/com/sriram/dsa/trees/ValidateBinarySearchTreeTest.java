package com.sriram.dsa.trees;
import com.sriram.dsa.model.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ValidateBinarySearchTreeTest { @Test void enforcesBoundsAcrossWholeSubtree() { assertTrue(ValidateBinarySearchTree.isValid(new TreeNode(2,new TreeNode(1),new TreeNode(3)))); assertFalse(ValidateBinarySearchTree.isValid(new TreeNode(5,new TreeNode(1),new TreeNode(4,new TreeNode(3),new TreeNode(6))))); assertFalse(ValidateBinarySearchTree.isValid(new TreeNode(2,new TreeNode(2),null))); assertTrue(ValidateBinarySearchTree.isValid(new TreeNode(0,new TreeNode(Integer.MIN_VALUE),new TreeNode(Integer.MAX_VALUE)))); } }
