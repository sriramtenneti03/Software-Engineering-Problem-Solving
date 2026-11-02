package com.sriram.dsa.graphs;
import com.sriram.dsa.model.GraphNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CloneGraphTest { @Test void copiesCyclesWithoutSharingNodes() { GraphNode a=new GraphNode(1),b=new GraphNode(2); a.neighbors.add(b);b.neighbors.add(a); GraphNode copy=CloneGraph.clone(a); assertNotSame(a,copy);assertEquals(1,copy.val);assertEquals(2,copy.neighbors.get(0).val);assertNotSame(b,copy.neighbors.get(0));assertSame(copy,copy.neighbors.get(0).neighbors.get(0)); assertNull(CloneGraph.clone(null)); } }
