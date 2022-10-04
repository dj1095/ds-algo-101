package edu.uta.dsnalgo.graphs;

import java.util.ArrayList;
import java.util.List;

public class UndirectedGraph implements Graph {

    private final List<List<Integer>> graph;

    public UndirectedGraph(int numberOfNodes) {
        this.graph = new ArrayList<>();
        for (int i = 0; i < numberOfNodes; i++) {
            this.graph.add(new ArrayList<>());
        }
    }

    @Override
    public void addEdge(int src, int destination) {
        graph.get(src).add(destination);
        graph.get(destination).add(src);
    }

    @Override
    public List<List<Integer>> getAllEdges() {
        return graph;
    }
}
