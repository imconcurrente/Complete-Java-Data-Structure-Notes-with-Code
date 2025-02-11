package com.java.MST;

//public class KruskalAlgorithm {
//
//}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgorithm {

   static class DisjointSet {
        List<Integer> rank = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();
        List<Integer> size = new ArrayList<>();

         public DisjointSet(int n) {
            for (int i = 0; i <= n; i++) {
                rank.add(0);
                parent.add(i);
                size.add(1);
            }
        }

        public int findUPar(int node) {
            if (node == parent.get(node)) {
                return node;
            }
            int ulp = findUPar(parent.get(node));
            parent.set(node, ulp);
            return parent.get(node);
        }

        public void unionBySize(int u, int v) {
            int ulp_u = findUPar(u);
            int ulp_v = findUPar(v);
            if (ulp_u == ulp_v) return;
            if (size.get(ulp_u) < size.get(ulp_v)) {
                parent.set(ulp_u, ulp_v);
                size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
            } else {
                parent.set(ulp_v, ulp_u);
                size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
            }
        }

        static class Edge implements Comparable<Edge> {
            int src, dest, weight;

            Edge(int _src, int _dest, int _wt) {
                this.src = _src;
                this.dest = _dest;
                this.weight = _wt;
            }

            // Comparator function used for sorting edges based on their weight
            public int compareTo(Edge compareEdge) {
                return this.weight - compareEdge.weight;
            }
        }

        // Function to find the sum of weights of edges of the Minimum Spanning Tree (MST)
        public static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
            List<Edge> edges = new ArrayList<>();
                // O(N + E)
            // Convert adjacency list to list of edges
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < adj.get(i).size(); j++) {
                    int adjNode = adj.get(i).get(j).get(0);
                    int wt = adj.get(i).get(j).get(1);
                    int node = i;
                    Edge temp = new Edge(i, adjNode, wt);
                    edges.add(temp);
                }
            }

            // Create a Disjoint Set (Union-Find) structure
            DisjointSet ds = new DisjointSet(V);
            // M log M
            // Sort the edges in increasing order of their weights
            Collections.sort(edges);

            int mstWt = 0;
            // M x 4 x alpha x 2
            // Process the edges and build the MST
            for (Edge edge : edges) {
                int u = edge.src;
                int v = edge.dest;
                int wt = edge.weight;

                // If the nodes are not connected, add the edge to the MST
                if (ds.findUPar(u) != ds.findUPar(v)) {
                    mstWt += wt;
                    ds.unionBySize(u, v);
                }
            }

            return mstWt;
        }

        public static void main(String[] args) {
            int V = 5;
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

            // Example edges
            int[][] edges = {{0, 1, 2}, {0, 2, 1}, {1, 2, 1}, {2, 3, 2}, {3, 4, 1}, {4, 2, 2}};

            // Initialize adjacency list
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }

            // Fill the adjacency list with edges
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];

                ArrayList<Integer> tmp1 = new ArrayList<>();
                ArrayList<Integer> tmp2 = new ArrayList<>();

                tmp1.add(v);
                tmp1.add(w);

                tmp2.add(u);
                tmp2.add(w);

                adj.get(u).add(tmp1);
                adj.get(v).add(tmp2);
            }

            // Call the spanningTree method to get the MST weight
            int mstWt = spanningTree(V, adj);
            System.out.println("The sum of all the edge weights in MST: " + mstWt);
        }
    }
}
