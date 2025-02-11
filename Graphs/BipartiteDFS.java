package com.java.Graphs;

import java.util.ArrayList;

public class BipartiteDFS {
    private boolean dfs(int node, int color, int[] colors, ArrayList<ArrayList<Integer>> adjList){
        colors[node] = color;
        for(int neighbor : adjList.get(node)){
            if (colors[neighbor] == -1){
                if (!dfs(neighbor, 1 - color, colors, adjList)) return false;
            } else if (colors[neighbor] == color) {
                return false;

            }
        }
        return true;
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adjList){
        int[] color = new int[V];
        for (int i = 0; i < V ; i++) color[i] = -1;

        for (int i = 0; i < V ; i++) {
            if (color[i] == -1){
                if(!dfs(i, 0, color, adjList)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            adjList.add(new ArrayList<>());
        }
        // Adding edges
        adjList.get(0).add(1);
        adjList.get(1).add(0);
        adjList.get(0).add(3);
        adjList.get(3).add(0);
        adjList.get(1).add(2);
        adjList.get(2).add(1);
        adjList.get(2).add(3);
        adjList.get(3).add(2);

        BipartiteBFS sol = new BipartiteBFS();
        boolean ans = sol.isBipartite(4, adjList);
        if (ans){
            System.out.println("The graph is bipartite.");
        }else {
            System.out.println("The graph is not bipartite.");
        }
    }

}
