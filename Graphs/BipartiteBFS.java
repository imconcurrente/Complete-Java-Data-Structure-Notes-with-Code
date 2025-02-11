package com.java.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import java.util.*;

public class BipartiteBFS {
    private boolean check(int start, int V, ArrayList<ArrayList<Integer>> adjList, int color[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0; // Color the starting node with color 0

        while (!q.isEmpty()) {
            int node = q.poll(); // Pop the front of the queue

            for (int neighbor : adjList.get(node)) {
                if (color[neighbor] == -1) { // If the neighbor hasn't been colored
                    color[neighbor] = 1 - color[node]; // Color it with the opposite color
                    q.add(neighbor);
                } else if (color[neighbor] == color[node]) { // If the neighbor has the same color
                    return false; // The graph is not bipartite
                }
            }
        }
        return true;
    }

    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adjList) {
        int[] color = new int[V];
        Arrays.fill(color, -1); // Initially, no node is colored

        // Check each disconnected component
        for (int i = 0; i < V; i++) {
            if (color[i] == -1) { // If the node has not been colored yet
                if (!check(i, V, adjList, color)) { // Perform BFS to check bipartiteness
                    return false; // If any component is not bipartite, return false
                }
            }
        }

        return true; // If no component is found to be not bipartite, return true
    }

    public static void main(String[] args) {
        // Create the adjacency list for a bipartite graph
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adjList.add(new ArrayList<>());
        }

        // Add edges to the graph
        adjList.get(0).add(1);
        adjList.get(1).add(0);
        adjList.get(0).add(2);
        adjList.get(2).add(0);
        adjList.get(1).add(3);
        adjList.get(3).add(1);
        adjList.get(2).add(3);
        adjList.get(3).add(2);

        BipartiteBFS obj = new BipartiteBFS();
        boolean ans = obj.isBipartite(4, adjList); // Check if the graph is bipartite

        // Output result
        if (ans) {
            System.out.println("1"); // Graph is bipartite
        } else {
            System.out.println("0"); // Graph is not bipartite
        }
    }
}

