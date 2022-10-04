package edu.uta.dsnalgo.graphs;

import java.util.ArrayList;
import java.util.List;

public class ConnectedComponents {

    public static void main(String[] args) {

        Graph graph = new UndirectedGraph(6);
        graph.addEdge(0, 3);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(4, 5);
        List<Boolean> visited = new ArrayList<>();
        List<List<Integer>> nodes = graph.getAllEdges();
        for (int i = 0; i < nodes.size(); i++) {
            visited.add(Boolean.FALSE);
        }
        int distinctComponents =0;
        for (List<Integer> children : nodes) {
            distinctComponents += dfs(children, nodes, visited);
        }
        //int distinctComponents = countConnectedComponents(graph.getAllEdges());

        System.out.print(distinctComponents);
    }

    private static int dfs(List<Integer> children, List<List<Integer>> nodes, List<Boolean> visited) {
        for (Integer child : children) {
            if (visited.get(child)) {
                return 0;
            }
            visited.set(child,Boolean.TRUE);
            dfs(nodes.get(child),nodes,visited);
        }
        return 1;
    }



    private static void initialize(List<Integer> parents, List<Integer> rank, int size) {
        for (int i = 0; i < size; i++) {
            parents.add(i);
            rank.add(1);
        }
    }
}
