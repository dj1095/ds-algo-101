package edu.uta.dsnalgo.graphs;

import java.util.List;

public class DetectCycle {

    private static final int WHITE = 0;
    private static final int GREY = 1;
    private static final int BLACK = 2;

    public static void main(String[] args) {
        Graph graph = new DirectedGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 4);
        graph.addEdge(4, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        System.out.print("Is Cycle Exists in the graph? " + cycleInGraph(graph.getAllEdges()));
    }


    private static boolean cycleInGraph(List<List<Integer>> edges) {
        int[] colors = new int[edges.size()];
        for (int i = 0; i < edges.size(); i++) {
            if (colors[i] != WHITE)
                continue;
            if (dfs(i, edges, colors))
                return true;
        }
        return false;
    }

    private static boolean dfs(int node, List<List<Integer>> edges, int[] colors) {
        colors[node] = GREY;
        List<Integer> neighbors = edges.get(node);
        for (int neighbor : neighbors) {
            if (colors[neighbor] == GREY) {
                return true;
            } else if (colors[neighbor] == BLACK) {
                continue;
            } else if (dfs(neighbor, edges, colors)) {
                return true;
            }
            ;
        }
        colors[node] = BLACK;
        return false;
    }
}
