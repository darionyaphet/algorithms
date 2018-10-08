package org.darion.yaphet.lintcode;

import java.util.*;

public class GraphValidTree {
    private Set<Integer> visited = new HashSet<>();

    public boolean validTree(int n, int[][] edges) {
//        for (int i = 0; i < edges.length; i++) {
//            Set<Integer> set = new HashSet<>();
//            set.add(edges[i][0]);
//            set.add(edges[i][1]);
//
//            while (true) {
//                boolean find = false;
//                for (int j = i; j < edges.length; j++) {
//                    if (set.contains(edges[i][0]) || set.contains(edges[i][1])) {
//                        return false;
//                    } else {
//                        if ((edges[i][0] == edges[j][0]) &&
//                                (edges[i][1] == edges[j][1]) &&
//                                (edges[i][0] == edges[j][1]) &&
//                                (edges[i][1] == edges[j][0])) {
//                            find = true;
//                            set.add(edges[j][0]);
//                            set.add(edges[j][1]);
//                        }
//                    }
//                }
//
//                if (!find) {
//
//                }
//            }
//        }


        List<List<Integer>> adjustList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            adjustList.add(new LinkedList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            adjustList.get(edge[0]).add(edge[1]);
            adjustList.get(edge[1]).add(edge[0]);
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] edges = new int[1][1];
        GraphValidTree instance = new GraphValidTree();
        System.out.println(instance.validTree(1, edges));
    }
}
