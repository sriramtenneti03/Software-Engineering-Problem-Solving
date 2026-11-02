package com.sriram.dsa.trees;
import com.sriram.dsa.model.TreeNode;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class BinaryTreeLevelOrderTraversalTest { @Test void groupsBreadthFirstValuesByLevel() { assertEquals(List.of(List.of(3),List.of(9,20),List.of(15,7)),BinaryTreeLevelOrderTraversal.levelOrder(new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7))))); assertTrue(BinaryTreeLevelOrderTraversal.levelOrder(null).isEmpty()); } }
