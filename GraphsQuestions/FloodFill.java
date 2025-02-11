package com.java.GraphsQuestions;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        // Store the original color to compare during recursion
        int orgCol = image[sr][sc];
        // If the original color is the same as the new color, no change is needed
        if (orgCol == color) {
            return image;
        }
        helper(image, sr, sc, color, vis, orgCol);
        return image;
    }

    public void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol) {
        // Check bounds and if the current pixel is already visited or has a different color
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }
        // Mark the current pixel as visited
        vis[sr][sc] = true;
        // Change the color of the current pixel
        image[sr][sc] = color;

        // Recursively visit neighbors
        // left
        helper(image, sr, sc - 1, color, vis, orgCol);
        // right
        helper(image, sr, sc + 1, color, vis, orgCol);
        // up
        helper(image, sr - 1, sc, color, vis, orgCol);
        // down
        helper(image, sr + 1, sc, color, vis, orgCol);
    }
}
