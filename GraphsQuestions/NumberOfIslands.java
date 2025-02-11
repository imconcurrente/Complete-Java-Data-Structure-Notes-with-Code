package com.java.GraphsQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int rowCount = grid.length;
        int colCount = grid[0].length;
        int islandCount = 0;

        // Direction vectors for 4 neighbors (up, down, left, right)
        int[] dirs = {-1, 0, 1, 0, -1, 0, 0, 1};

        // Loop through the entire grid
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (grid[i][j] == '1') {  // If we find an unvisited land
                    islandCount++;  // Increment island count
                    bfs(grid, i, j, rowCount, colCount, dirs);  // Start BFS to mark the island
                }
            }
        }

        return islandCount;
    }

    // BFS helper function to mark connected land as visited
    private void bfs(char[][] grid, int x, int y, int rowCount, int colCount, int[] dirs) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        grid[x][y] = '0';  // Mark as visited by changing '1' to '0'

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int cx = cell[0];
            int cy = cell[1];

            // Explore all 4 possible directions (up, down, left, right)
            for (int d = 0; d < 8; d += 2) {
                int nx = cx + dirs[d];
                int ny = cy + dirs[d + 1];

                // Check if the new position is within bounds and is land
                if (nx >= 0 && nx < rowCount && ny >= 0 && ny < colCount && grid[nx][ny] == '1') {
                    queue.offer(new int[]{nx, ny});
                    grid[nx][ny] = '0';  // Mark as visited
                }
            }
        }
    }

    public static void main(String[] args) {
        NumberOfIslands solution = new NumberOfIslands();

        // Example grid:
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '1', '0'},
                {'0', '0', '0', '0', '0'}
        };

        // Output: 1 (There is one island in this grid)
        System.out.println(solution.numIslands(grid));
    }
}