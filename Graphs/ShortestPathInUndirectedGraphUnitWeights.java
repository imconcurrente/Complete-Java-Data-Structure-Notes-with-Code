package com.java.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInUndirectedGraphUnitWeights {
    public int[] shortestPath(int[][] edges, int n, int m, int src){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][0]).add(edges[i][0]);
        }
        int dist[] = new int[n];
        for (int i = 0; i < n ; i++)  dist[i] = (int) 1e9;
        dist[src] = 0;

       // BFS Implementation
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        while (!queue.isEmpty()){
            int node = queue.peek();
            queue.remove();
            for(int neighbor : adj.get(node)){
                if (dist[node] + 1 < dist[neighbor]){
                    dist[neighbor] = 1 + dist[node];
                    queue.add(neighbor);
                }
            }
        }
        for(int i = 0; i< n; i++){
            if (dist[i] == 1e9){
                dist[i] = -1;
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int n = 9, m = 10;
        int[][] edges = {{0,1},{0,3},{3,4},{4,5},{5,6},{1,2},{2,6},{6,7},{7,8},{6,8}};
        ShortestPathInUndirectedGraphUnitWeights obj = new ShortestPathInUndirectedGraphUnitWeights();
        int result[] = obj.shortestPath(edges, n, m, 0);
        for (int i = 0; i < n ; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
