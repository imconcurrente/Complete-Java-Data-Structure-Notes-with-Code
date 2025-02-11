package com.java.Graphs;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    static void addEdge(List<List<Integer>> adj, int s,
                        int t){
        adj.get(s).add(t);
        adj.get(t).add(s);
    }

    // Recursive function for DFS traversal
    static void DFSRec(List<List<Integer> > adj,
                       boolean[] visited, int s){
        visited[s] = true;
        System.out.print(s + " ");

        // Recursively visit all adjacent vertices that are
        // not visited yet
        for (int i : adj.get(s)) {
            if (!visited[i]) {
                DFSRec(adj, visited, i);
            }
        }
    }
    // Main DFS function to perform DFS for the entire graph
    static void DFS(List<List<Integer> > adj, int V) {
        boolean[] visited = new boolean[V];

        // Loop through all vertices to handle disconnected
        // graph
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFSRec(adj, visited, i);
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;

        // Create an adjacency list for the graph
        List<List<Integer> > adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Define the edges of the graph
        int[][] edges
                = { { 1, 2 }, { 2, 0 }, { 0, 3 }, { 4, 5 } };

        // Populate the adjacency list with edges
        for (int[] edge : edges) {
            addEdge(adj, edge[0], edge[1]);
        }

        System.out.println("Complete DFS of the graph:");
        DFS(adj, V);
    }
}
