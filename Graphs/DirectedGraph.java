package com.java.Graphs;

import java.util.ArrayList;

public class DirectedGraph {
//Graph implementation with Adjacency Matrix and ArrayList Representations
        private int vertices;
        private int[][] adjacencyMatrix;
        private ArrayList<ArrayList<Integer>> adjacencyList;

        public DirectedGraph(int vertices) {
            this.vertices = vertices;
            adjacencyMatrix = new int[vertices][vertices];

            adjacencyList = new ArrayList<>();
            for (int i = 0; i < vertices ; i++) {
                adjacencyList.add(new ArrayList<>());
            }
        }
        public void addEdgeMatrix(int src, int dest) {
            adjacencyMatrix[src][dest] = 1;
        }

        public void addEdgeList(int src, int dest){
            adjacencyList.get(src).add(dest);
        }

        // Display the adjacency matrix
        public void displayMatrix(){
            System.out.println("Adjacency Matrix(Directed Graph):");
            for (int i = 0; i < vertices ; i++) {
                for (int j = 0; j < vertices ; j++) {
                    System.out.print(adjacencyMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        // Display the adjacency list
        public void displayList(){
            System.out.println("Adjacency List (Directed Graph):");
            for (int i = 0; i < vertices; i++) {
                System.out.print(i + ": ");
                for (int neighbor : adjacencyList.get(i)){
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph(5);

        // Add directed edges using adjacency matrix
        graph.addEdgeMatrix(0, 1);
        graph.addEdgeMatrix(0, 4);
        graph.addEdgeMatrix(1, 2);
        graph.addEdgeMatrix(1, 3);
        graph.addEdgeMatrix(3, 4);

        // Add directed edges using adjacency list
        graph.addEdgeList(0, 1);
        graph.addEdgeList(0, 4);
        graph.addEdgeList(1, 2);
        graph.addEdgeList(1, 3);
        graph.addEdgeList(3, 4);

        // Display the graph using both representations
        graph.displayMatrix();
        graph.displayList();
    }
    }

