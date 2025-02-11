package com.java.GraphsQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberofDistinctIslands {
    public int numDistinctIslands(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        Set<List<int[]>> distinctIslands = new HashSet<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        // Iterate over the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // If we find an unvisited island, start DFS
                if (grid[i][j] == 1 && !visited[i][j]) {
                    // Use ArrayList to store the island shape
                    ArrayList<int[]> islandShape = new ArrayList<>();
                    dfs(grid, visited, i, j, islandShape, i, j); // Capture starting point (i, j)
                    distinctIslands.add(islandShape); // Add island shape to set (uses object comparison)
                }
            }
        }

        return distinctIslands.size();
    }

    // Depth-First Search (DFS) helper function to explore an island
    private void dfs(int[][] grid, boolean[][] visited, int i, int j, ArrayList<int[]> islandShape, int originX, int originY) {
        // Check bounds and if the cell is already visited or water (0)
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]) {
            return;
        }

        // Mark the current cell as visited
        visited[i][j] = true;

        // Record the relative position of the cell to the starting point
        islandShape.add(new int[]{i - originX, j - originY}); // Use ArrayList's add() method

        // Explore the four possible directions
        dfs(grid, visited, i + 1, j, islandShape, originX, originY);
        dfs(grid, visited, i - 1, j, islandShape, originX, originY);
        dfs(grid, visited, i, j + 1, islandShape, originX, originY);
        dfs(grid, visited, i, j - 1, islandShape, originX, originY);
    }

    public static void main(String[] args) {
        NumberofDistinctIslands solution = new NumberofDistinctIslands();
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };
        int result = solution.numDistinctIslands(grid);
        System.out.println("Number of distinct islands: " + result);
    }
}
