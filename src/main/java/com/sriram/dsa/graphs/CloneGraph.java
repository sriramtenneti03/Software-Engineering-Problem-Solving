package com.sriram.dsa.graphs;

import com.sriram.dsa.model.GraphNode;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public final class CloneGraph {
    private CloneGraph() { }
    /** Breadth-first copy with an original-to-copy map. O(V+E) time and O(V) space. */
    public static GraphNode clone(GraphNode node) {
        if (node == null) return null;
        Map<GraphNode, GraphNode> copies = new HashMap<>(); Queue<GraphNode> queue = new ArrayDeque<>();
        copies.put(node, new GraphNode(node.val)); queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode current = queue.remove();
            for (GraphNode neighbor : current.neighbors) {
                if (!copies.containsKey(neighbor)) { copies.put(neighbor, new GraphNode(neighbor.val)); queue.add(neighbor); }
                copies.get(current).neighbors.add(copies.get(neighbor));
            }
        }
        return copies.get(node);
    }
}
