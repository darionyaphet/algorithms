package org.darion.yaphet.lintcode;

import java.util.LinkedList;
import java.util.Queue;

public class CloneGraph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }

        UndirectedGraphNode cloneNode = new UndirectedGraphNode(node.label);
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            UndirectedGraphNode n = queue.poll();
            for (UndirectedGraphNode graphNode : n.neighbors) {

            }
        }
        return cloneNode;
    }

    public static void main(String[] args) {
        CloneGraph instance = new CloneGraph();
        System.out.println(instance.cloneGraph(null));
    }
}
