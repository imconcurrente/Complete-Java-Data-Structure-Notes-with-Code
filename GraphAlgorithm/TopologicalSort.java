package com.java.GraphAlgorithm;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    public void dfs(int node, ArrayList<ArrayList<Integer>> graph, boolean[] visited, Stack<Integer> stack) {
        visited[node] = true;

        // Visit all the neighbors of the current node
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, stack);
            }
        }

        // Add the node to the stack once all its neighbors are processed
        stack.push(node);
    }

    // Function to perform topological sort
    public ArrayList<Integer> topologicalSort(int numNodes, ArrayList<ArrayList<Integer>> graph) {
        boolean[] visited = new boolean[numNodes];
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Perform DFS for each node
        for (int i = 0; i < numNodes; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited, stack);
            }
        }

        // Pop elements from the stack and store the result
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }

    public static void main(String[] args) {
        TopologicalSort solution = new TopologicalSort();

        // Example graph: 6 nodes, edges (0 -> 1, 0 -> 2, 1 -> 3, 1 -> 4, 2 -> 4, 4 -> 5)
        int numNodes = 6;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numNodes; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges to the graph
        graph.get(2).add(3);
        graph.get(3).add(1);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(5).add(0);
        graph.get(5).add(2);

        // Perform topological sort
        ArrayList<Integer> result = solution.topologicalSort(numNodes, graph);

        // Print the result
        System.out.println("Topological Sort: " + result);
    }
}
