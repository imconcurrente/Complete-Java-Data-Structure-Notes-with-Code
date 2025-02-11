package com.java.Graphs;

import java.util.ArrayList;

// I have take visted and pathVisited in boolean type, you can take in int type also
public class DetectDirectedGraphCycleDFS {
    // DFS function to detect cycle in an Directed graph
    private boolean dfs(int node, boolean [] visited, boolean[] pathVisited, ArrayList<ArrayList<Integer>> adjList ){
        visited[node] = true;
        pathVisited[node] = true;

        for (int neighbor : adjList.get(node)){
            if (!visited[neighbor]){
                if (dfs(neighbor, visited, pathVisited, adjList)){
                    return true;
                }
            } else if (pathVisited[neighbor]) {
                return true;

            }
        }

        pathVisited[node] = false;
        return false;

    }

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[V];
        boolean[] pathVisited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                if (dfs(i, visited, pathVisited, adjList)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1); // This creates a cycle

        DetectDirectedGraphCycleDFS obj = new DetectDirectedGraphCycleDFS();
        boolean hasCycle = obj.isCyclic(4, adj);
        if (hasCycle) {
            System.out.println("The graph has a cycle.");
        } else {
            System.out.println("The graph does not have a cycle.");
        }
    }
}
