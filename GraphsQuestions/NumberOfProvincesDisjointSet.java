package com.java.GraphsQuestions;

import java.util.ArrayList;
import java.util.List;
//Number of Provinces - Disjoint Set
public class NumberOfProvincesDisjointSet {

    static class DisjointSet {
        List<Integer> parent = new ArrayList<>();
        List<Integer> size = new ArrayList<>();

        public DisjointSet(int n) {
            for (int i = 0; i < n; i++) {
                parent.add(i);  // Initially, each node is its own parent
                size.add(1);    // Initial size of each component is 1
            }
        }

        public int findUPar(int node) {
            if (node == parent.get(node)) {
                return node;
            }
            int ulp = findUPar(parent.get(node));  // Path compression
            parent.set(node, ulp);  // Make each node point directly to its ultimate parent
            return ulp;
        }

        public void unionBySize(int u, int v) {
            int ulp_u = findUPar(u);
            int ulp_v = findUPar(v);

            if (ulp_u == ulp_v) return;  // They are already in the same set

            // Union by size: attach the smaller tree to the larger tree
            if (size.get(ulp_u) < size.get(ulp_v)) {
                parent.set(ulp_u, ulp_v);
                size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
            } else {
                parent.set(ulp_v, ulp_u);
                size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
            }
        }
    }
        public int findCircleNum(int[][] isConnected) {
            int n = isConnected.length; // Number of cities (nodes)
            DisjointSet ds = new DisjointSet(n);  // Create a Disjoint Set (Union-Find)

            // Iterate over the adjacency matrix and union connected cities
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {  // Only check upper triangle (i < j) to avoid redundant work
                    if (isConnected[i][j] == 1) {
                        ds.unionBySize(i, j);  // Union the cities if they are connected
                    }
                }
            }

            // Count the number of provinces (disjoint sets)
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (ds.findUPar(i) == i) {  // Check if the city is its own parent (i.e., a root of a component)
                    cnt++;
                }
            }
            return cnt;
        }
    }

