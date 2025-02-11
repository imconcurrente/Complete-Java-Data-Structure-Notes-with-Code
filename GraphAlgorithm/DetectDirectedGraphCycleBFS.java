package com.java.GraphAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectDirectedGraphCycleBFS {

    // BFS function to detect cycle in an Directed graph using Kahn’s Algorithm(Topological Sorting Using BFS)
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int indegree[] = new int[V];
        for (int i = 0; i < V; i++) {
            for (Integer neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        int count = 0;
        while (!queue.isEmpty()) {
            Integer node = queue.poll();    //Or int node = queue.peek();
                                           //    queue.remove();
            count++;
            for (Integer neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }
        if (count == V) return false;
        return true;
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(2);

        DetectDirectedGraphCycleBFS obj = new DetectDirectedGraphCycleBFS();
        boolean ans = obj.isCyclic(V, adj);
        if (ans)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
