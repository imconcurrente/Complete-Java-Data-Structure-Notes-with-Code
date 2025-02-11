package com.java.MST;

import java.util.ArrayList;
import java.util.PriorityQueue;


public class DijkstraUsingPriorityQueue {
    static class Pair{
        int node;
        int distance;
        public Pair(int distance,int node){
            this.node = node;
            this.distance = distance;
        }
    }
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int src) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a, b) -> a.distance - b.distance);

        int[] dist = new int[V];
        for (int i = 0; i < V; i++) dist[i] = (int) (1e9);

        dist[src] = 0;
        pq.add(new Pair(0, src));

        while (!pq.isEmpty()) {
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            // Traverse all adjacent nodes
            for (int i = 0; i < adj.get(node).size(); i++) {
                int edgeWeight = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);


//                Update distance if a shorter path is found
                if (dis + edgeWeight < dist[adjNode]) {
                    dist[adjNode] = dis + edgeWeight;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        return dist;
    }
}
