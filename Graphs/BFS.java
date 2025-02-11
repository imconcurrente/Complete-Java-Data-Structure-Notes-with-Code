package com.java.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// BFS showing for undirected Graph using ArrayList
public class BFS {
    private ArrayList<ArrayList<Integer>> adjList;

    public BFS(int vertices) {
        adjList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest); // Add destination to source's adjacency list
        adjList.get(dest).add(src); // Add source to destination's adjacency list (undirected)
    }

    // Perform BFS traversal from the start node
    public void bfs(int start) {
        boolean[] visited = new boolean[adjList.size()]; // Array to track visited nodes
        Queue<Integer> queue = new LinkedList<>(); // Queue for BFS

        // Mark the start node as visited and enqueue it
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll(); // Dequeue a node
            System.out.print(node + " "); // Print the node

            // Visit all adjacent nodes of the current node
            for (int neighbor : adjList.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true; // Mark as visited
                    queue.offer(neighbor); // Enqueue the neighbor
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS graph = new BFS(6);

        // Add edges to the undirected graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 5);

        System.out.println("Breadth-First Search starting from node 0:");
        graph.bfs(0);
    }
}
