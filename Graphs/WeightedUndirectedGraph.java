package com.java.Graphs;

import java.util.ArrayList;

public class WeightedUndirectedGraph {
    private int vertices;
    private int[][] adjacencyMatrix;  // Adjacency Matrix to store weights
    private ArrayList<ArrayList<Edge>> adjacencyList;  // Adjacency List to store weights

    // Edge class to represent a weighted edge
    class Edge {
        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    // Constructor for the WeightedUndirectedGraph
    public WeightedUndirectedGraph(int vertices) {
        this.vertices = vertices;

        // Initialize the adjacency matrix with a default value (e.g., -1 for no edge)
        adjacencyMatrix = new int[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                adjacencyMatrix[i][j] = -1;  // Using -1 to indicate no edge
            }
        }

        // Initialize the adjacency list
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Add a weighted edge using the adjacency matrix
    public void addEdgeMatrix(int src, int dest, int weight) {
        adjacencyMatrix[src][dest] = weight;
        adjacencyMatrix[dest][src] = weight;  // Since it's an undirected graph
    }

    // Add a weighted edge using the adjacency list
    public void addEdgeList(int src, int dest, int weight) {
        adjacencyList.get(src).add(new Edge(dest, weight));
        adjacencyList.get(dest).add(new Edge(src, weight));  // Since it's an undirected graph
    }

    // Display the adjacency matrix
    public void displayMatrix() {
        System.out.println("Adjacency Matrix (Weighted Undirected Graph):");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (adjacencyMatrix[i][j] == -1) {
                    System.out.print("INF ");  // INF indicates no edge
                } else {
                    System.out.print(adjacencyMatrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // Display the adjacency list
    public void displayList() {
        System.out.println("Adjacency List (Weighted Undirected Graph):");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (Edge edge : adjacencyList.get(i)) {
                System.out.print("(" + edge.destination + ", " + edge.weight + ") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        WeightedUndirectedGraph graph = new WeightedUndirectedGraph(5);

        // Add weighted edges using the adjacency matrix
        graph.addEdgeMatrix(0, 1, 10);
        graph.addEdgeMatrix(0, 4, 20);
        graph.addEdgeMatrix(1, 2, 30);
        graph.addEdgeMatrix(1, 3, 40);
        graph.addEdgeMatrix(3, 4, 50);

        // Add weighted edges using the adjacency list
        graph.addEdgeList(0, 1, 10);
        graph.addEdgeList(0, 4, 20);
        graph.addEdgeList(1, 2, 30);
        graph.addEdgeList(1, 3, 40);
        graph.addEdgeList(3, 4, 50);

        // Display the graph using both representations
        graph.displayMatrix();
        graph.displayList();
    }
}
