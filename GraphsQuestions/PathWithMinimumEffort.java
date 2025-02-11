package com.java.GraphsQuestions;

import java.util.PriorityQueue;

public class PathWithMinimumEffort {

    class Tuple{
        int distance;
        int row;
        int col;
        public Tuple(int distance,int row, int col){
            this.row = row;
            this.distance = distance;
            this.col = col;
        }
    }
        public int minimumEffortPath(int heights[][]) {

            // Create a priority queue containing pairs of cells
            // and their respective distance from the source cell in the
            // form {diff, {row of cell, col of cell}}.
            PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>((x,y) -> x.distance - y.distance);

            int n = heights.length;
            int m = heights[0].length;

            // Create a distance matrix with initially all the cells marked as
            // unvisited and the dist for source cell (0,0) as 0.
            int[][] dist = new int[n][m];
            for(int i = 0;i<n;i++) {
                for(int j = 0;j<m;j++) {
                    dist[i][j] = (int)(1e9);
                }
            }

            dist[0][0] = 0;
            pq.add(new Tuple(0, 0, 0));

            // The following delta rows and delts columns array are created such that
            // each index represents each adjacent node that a cell may have
            // in a direction.
            int drow[] = {-1, 0, 1, 0};
            int dcol[] = {0, 1, 0, -1};

            // Iterate through the matrix by popping the elements out of the queue
            // and pushing whenever a shorter distance to a cell is found.
            while(pq.size() != 0) {
                Tuple neighbor = pq.peek();
                pq.remove();
                int diff = neighbor.distance;
                int row = neighbor.row;
                int col = neighbor.col;

                // Check if we have reached the destination cell,
                // return the current value of difference (which will be min).
                if(row == n-1 && col == m-1) return diff;
                // row - 1, col
                // row, col + 1
                // row - 1, col
                // row, col - 1
                for(int i = 0;i<4;i++) {
                    int newrow = row + drow[i];
                    int newcol = col + dcol[i];

                    // Checking validity of the cell.
                    if(newrow>=0 && newcol >=0 && newrow < n && newcol < m) {

                        // Effort can be calculated as the max value of differences
                        // between the heights of the node and its adjacent nodes.
                        int newEffort =
                                Math.max(
                                        Math.abs(heights[row][col] - heights[newrow][newcol]), diff);

                        // If the calculated effort is less than the prev value
                        // we update as we need the min effort.
                        if(newEffort < dist[newrow][newcol]) {
                            dist[newrow][newcol] = newEffort;
                            pq.add(new Tuple(newEffort, newrow, newcol));
                        }
                    }
                }
            }
            // If the destination is unreachable.
            return 0;
        }
        public static void main(String[] args) {

            int[][] heights={{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};

            PathWithMinimumEffort obj = new PathWithMinimumEffort();
            int ans = obj.minimumEffortPath(heights);

            System.out.print(ans);
            System.out.println();
    }
}
