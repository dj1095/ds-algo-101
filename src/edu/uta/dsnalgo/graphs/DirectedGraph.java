package edu.uta.dsnalgo.graphs;

import java.util.ArrayList;
import java.util.List;

public class DirectedGraph implements Graph {
    private final List<List<Integer>> graph;

    public DirectedGraph(int numberOfNodes) {
        this.graph = new ArrayList<>();
        for (int i = 0; i < numberOfNodes; i++) {
            this.graph.add(new ArrayList<>());
        }
    }

    @Override
    public void addEdge(int src, int destination) {
        graph.get(src).add(destination);
    }

    @Override
    public List<List<Integer>> getAllEdges() {
        return graph;
    }

}
