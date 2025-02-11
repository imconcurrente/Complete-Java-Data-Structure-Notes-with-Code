package com.java.GraphsQuestions;

import java.util.Arrays;

public class SurroundedRegions {
    private final int[] del = {-1, 0, 1, 0, -1, 0};

    // DFS helper function to perform depth-first search and mark all 'O's connected to the border
    private void dfs(char[][] board, int i, int j) {
        // Base case: if out of bounds or cell is not 'O', return
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
            return;
        }

        // Mark the current 'O' as 'T' to indicate it is safe
        board[i][j] = 'T';

        // Explore all 4 directions: up, right, down, left
        for (int d = 0; d < 4; d++) {
            int newRow = i + del[d];
            int newCol = j + del[d + 1];
            dfs(board, newRow, newCol);
        }
    }

    public void solve(char[][] board) {
        // If the board is empty, no need to process
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }

        int rows = board.length;
        int cols = board[0].length;

        // Step 1: Start DFS from the borders (first and last row, first and last column)
        // First and last row
        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') {
                dfs(board, 0, j); // Top row
            }
            if (board[rows - 1][j] == 'O') {
                dfs(board, rows - 1, j); // Bottom row
            }
        }

        // First and last column
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0); // Left column
            }
            if (board[i][cols - 1] == 'O') {
                dfs(board, i, cols - 1); // Right column
            }
        }

        // Step 2: Flip all the 'O's that are not connected to the borders to 'X' (capturing surrounded regions)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X'; // Flip to 'X' because it's surrounded
                }
            }
        }

        // Step 3: Restore all the 'T's back to 'O' (safe regions connected to the border)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'T') {
                    board[i][j] = 'O'; // Restore the safe 'O'
                }
            }
        }
    }

    public static void main(String[] args) {
        SurroundedRegions solution = new SurroundedRegions();

        // Input board for testing
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'X', 'O', 'O'}
        };

        // Print the board before solving
        System.out.println("Before solving:");
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }

        // Solve the problem
        solution.solve(board);

        // Print the board after solving
        System.out.println("\nAfter solving:");
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
