package com.sriram.dsa.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class NodeModelsTest { @Test void constructorsInitializeValuesAndLinks() { ListNode list=new ListNode(1,new ListNode(2)); assertEquals(1,list.val);assertEquals(2,list.next.val); TreeNode tree=new TreeNode(3,new TreeNode(2),new TreeNode(4));assertEquals(2,tree.left.val);assertEquals(4,tree.right.val);GraphNode graph=new GraphNode(5);graph.neighbors.add(new GraphNode(6));assertEquals(5,graph.val);assertEquals(6,graph.neighbors.get(0).val); } }
