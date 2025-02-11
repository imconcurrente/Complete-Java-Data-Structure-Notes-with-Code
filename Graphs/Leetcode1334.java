package com.java.Graphs;

public class Leetcode1334 {
    // Find the City With the Smallest Number of Neighbors at a Threshold Distance
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        // Step 1: Initialize distance matrix with max values
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        // Step 2: Set the edge weights in the distance matrix
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            dist[u][v] = wt;
            dist[v][u] = wt; // Undirected graph
        }

        // Step 3: Apply the Floyd-Warshall algorithm to calculate the shortest paths
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        // Step 4: Find the city with the smallest number of reachable cities within the threshold
        int cityNo = -1;
        int cntCity = n;  // Max possible cities

        for (int city = 0; city < n; city++) {
            int cnt = 0;
            for (int adjCity = 0; adjCity < n; adjCity++) {
                if (dist[city][adjCity] <= distanceThreshold) {
                    cnt++;
                }
            }
            // Choose the city with the minimum reachable cities
            if (cnt <= cntCity) {
                cntCity = cnt;
                cityNo = city;
            }
        }

        return cityNo;
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {
                {0, 1, 3},
                {1, 2, 1},
                {2, 3, 1},
                {0, 3, 10}
        };
        int distanceThreshold = 4;
        Leetcode1334 obj = new Leetcode1334();
        int cityNo = obj.findTheCity(n, edges, distanceThreshold);
        System.out.println("The answer is node: " + cityNo);
    }
}