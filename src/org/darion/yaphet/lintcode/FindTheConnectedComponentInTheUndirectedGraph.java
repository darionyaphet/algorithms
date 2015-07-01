package org.darion.yaphet.lintcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * http://www.lintcode.com/zh-cn/problem/find-the-connected-component-in-the-
 * undirected-graph/
 * 
 * @author darion.yaphet
 * 
 */
public class FindTheConnectedComponentInTheUndirectedGraph {
	public FindTheConnectedComponentInTheUndirectedGraph() {

	}

	public List<List<Integer>> connectedSet(ArrayList<UndirectedGraphNode> nodes) {
		if (nodes == null || nodes.size() == 0) {
			return new ArrayList<List<Integer>>();
		}

		Set<Integer> foundSet = new HashSet<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		for (UndirectedGraphNode node : nodes) {
			if (!foundSet.contains(node.label)) {
				foundSet.add(node.label);
				// System.out.println("Found : " + node.label);
				List<Integer> subList = new ArrayList<Integer>();
				subList.add(node.label);
				// System.out.println(" --> " + node.label);

				for (UndirectedGraphNode neighbor : node.neighbors) {
					if (!foundSet.contains(neighbor.label)) {
						foundSet.add(neighbor.label);
						subList.add(neighbor.label);
						// System.out.println(" --> " + neighbor.label);
					}
				}
				result.add(subList);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		FindTheConnectedComponentInTheUndirectedGraph instance = new FindTheConnectedComponentInTheUndirectedGraph();
		ArrayList<UndirectedGraphNode> nodes = new ArrayList<UndirectedGraphNode>();

		UndirectedGraphNode A = new UndirectedGraphNode(0);
		UndirectedGraphNode B = new UndirectedGraphNode(1);
		UndirectedGraphNode C = new UndirectedGraphNode(2);
		UndirectedGraphNode D = new UndirectedGraphNode(3);
		UndirectedGraphNode E = new UndirectedGraphNode(4);

		A.neighbors.add(B);
		A.neighbors.add(D);

		B.neighbors.add(A);
		B.neighbors.add(D);

		D.neighbors.add(A);
		D.neighbors.add(B);

		C.neighbors.add(E);
		E.neighbors.add(C);
		nodes.add(A);
		nodes.add(B);
		nodes.add(C);
		nodes.add(D);
		nodes.add(E);

		List<List<Integer>> result = instance.connectedSet(nodes);
		result = instance.connectedSet(null);
		System.out.println(result);

		/*
		 * IN:
		 * {-15,4,-13,0,-8#-14,-3,10#-13,-15#-12,-4,-8#-11,-1#-10,13,6#-9#-8,
		 * -6,2 ,
		 * -15,-12#-7,6,-2,14#-6,-8#-5,-4#-4,-12,-5#-3,-14,1#-2,-7,4,9#-1,
		 * 0,1,-11 #
		 * 0,-1,8,-15,3#1,-1,-3#2,-8,10#3,13,0#4,-15,-2#5,6,10#6,-7,-10,5#7#8,0#
		 * 9,-2#10,11,5,-14,2#11,10#12#13,-10,3#14,-7,14,14}
		 * 
		 * Real OUT:
		 * [[-15,4,-13,0,-8],[-14,-3,10],[-12,-4],[-11,-1],[-10,13,6],[-9],[
		 * -7,-2,14],[-6],[-5],[1],[2],[3],[5],[7],[8],[9],[11],[12]]
		 * 
		 * Except OUT :
		 * [[-15,-14,-13,-12,-11,-10,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3
		 * ,4,5,6,8,9,10,11,13,14],[-9],[7],[12]]
		 */
	}
}
