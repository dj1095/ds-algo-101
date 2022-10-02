package edu.uta.daa.graphs;

import java.util.List;

public interface Graph {
    void addEdge(int src, int destination);

    List<List<Integer>> getAllEdges();
}
