package com.java.Graphs;

import java.util.ArrayList;

public class UndirectedGraph {
    //Graph implementation with Adjacency Matrix and ArrayList Representations
    private int[][] adjMatrix; // Adjacency matrix to represent the graph
    private ArrayList<ArrayList<Integer>> adjList; // Adjacency list to represent the graph
    private int vertices; // Number of vertices in the graph

    // Constructor for the graph
    public UndirectedGraph(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices]; // Initialize the adjacency matrix
        adjList = new ArrayList<>(); // Initialize the adjacency list

        // Initialize the adjacency list with empty lists for each vertex
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add an undirected edge to the graph
    public void addEdge(int u, int v) {
        // Update adjacency matrix
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1; // Because it's an undirected graph

        // Update adjacency list
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    // Print the adjacency matrix representation of the graph
    public void printAdjMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Print the adjacency list representation of the graph
    public void printAdjList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Integer neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Create a graph with 5 vertices (0, 1, 2, 3, 4)
        UndirectedGraph g = new UndirectedGraph(5);

        // Add undirected edges to the graph
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        // Print the graph using adjacency matrix
        g.printAdjMatrix();

        // Print the graph using adjacency list
        g.printAdjList();
    }
}
