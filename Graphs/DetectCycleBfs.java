package com.java.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleBfs {
    // BFS function to detect cycle in an undirected graph
    public static boolean bfsDetectCycle(ArrayList<ArrayList<Integer>> graph, int start, boolean[] visited) {
        // Create a queue for BFS, where each element is an array: [current_node, parent_node]
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, -1}); // Start with the node and no parent (-1)
        visited[start] = true;

        // Perform BFS
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int node = current[0];
            int parent = current[1];

            // Explore all neighbors of the current node
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    // If the neighbor hasn't been visited, mark it as visited and add to queue
                    visited[neighbor] = true;
                    queue.add(new int[]{node, neighbor});
                } else if (neighbor != parent) {
                    // If the neighbor is visited and not the parent, we have detected a cycle
                    return true;
                }
            }
        }
        return false; // No cycle detected
    }

    // Function to check if the graph has a cycle
    public static boolean detectCycle(ArrayList<ArrayList<Integer>> graph, int n) {
        boolean[] visited = new boolean[n]; // To track visited nodes

        // Check each node (in case the graph is disconnected)
        for (int node = 0; node < n; node++) {
            if (!visited[node]) {
                if (bfsDetectCycle(graph, node, visited)) {
                    return true; // Cycle detected
                }
            }
        }
        return false; // No cycle detected
    }

    public static void main(String[] args) {
        // Graph as an ArrayList of ArrayLists (Adjacency list representation)
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize graph with 5 nodes (0 to 4)
        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (undirected)
        graph.get(0).add(1);
        graph.get(1).add(0);
        graph.get(1).add(2);
        graph.get(2).add(1);
        graph.get(2).add(3);
        graph.get(3).add(2);
        graph.get(3).add(4);
        graph.get(4).add(3);
        graph.get(1).add(4);
        graph.get(4).add(1); // This creates a cycle

        // Detect cycle in the graph
        int n = graph.size(); // Number of nodes
        if (detectCycle(graph, n)) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle Detected");
        }
    }
}
