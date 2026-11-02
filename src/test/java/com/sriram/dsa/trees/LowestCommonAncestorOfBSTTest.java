package com.sriram.dsa.trees;
import com.sriram.dsa.model.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LowestCommonAncestorOfBSTTest { @Test void findsSplitPointOrOneOfTheNodes() { TreeNode three=new TreeNode(3),five=new TreeNode(5),four=new TreeNode(4,three,five),two=new TreeNode(2,new TreeNode(0),four),root=new TreeNode(6,two,new TreeNode(8)); assertSame(root,LowestCommonAncestorOfBST.find(root,two,root.right)); assertSame(two,LowestCommonAncestorOfBST.find(root,two,four)); } }
