package com.java.Graphs;

import java.util.ArrayList;

public class DetectCycleDfs {

        // DFS function to detect cycle in an undirected graph
        public static boolean dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited, int parent) {
            visited[node] = true;  // Mark the current node as visited

            // Explore all the neighbors of the current node
            for (int neighbor : graph.get(node)) {
                // If the neighbor hasn't been visited, recursively call DFS
                if (!visited[neighbor]) {
                    if (dfs(graph, neighbor, visited, node)) {
                        return true;  // Cycle detected in the DFS tree
                    }
                }
                // If the neighbor is visited and is not the parent, a cycle is found
                else if (neighbor != parent) {
                    return true;  // Cycle detected
                }
            }

            return false;  // No cycle detected in the current DFS path
        }

        // Function to check if the graph contains a cycle
        public static boolean hasCycle(ArrayList<ArrayList<Integer>> graph, int v) {
            boolean[] visited = new boolean[v];  // To track visited nodes

            // Check for a cycle starting from every unvisited node
            for (int i = 0; i < v; i++) {
                if (!visited[i]) {
                    if (dfs(graph, i, visited, -1)) {
                        return true;  // Cycle detected
                    }
                }
            }

            return false;  // No cycle detected in the entire graph
        }

        public static void main(String[] args) {
            // Graph as an adjacency list (ArrayList of ArrayLists)
            int v = 6;  // Number of nodes
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            // Initialize the adjacency list
            for (int i = 0; i < v; i++) {
                graph.add(new ArrayList<>());
            }

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
            graph.get(4).add(5);
            graph.get(5).add(4);


//            graph.get(0).add(1);
//            graph.get(1).add(0);
//            graph.get(1).add(2);
//            graph.get(2).add(1);
//            graph.get(3).add(4);
//            graph.get(4).add(3);
//            graph.get(4).add(5);
//            graph.get(5).add(4);

            // Detect cycle in the graph
            if (hasCycle(graph, v)) {
                System.out.println("Cycle Detected");
            } else {
                System.out.println("No Cycle Detected");
            }
        }
    }

