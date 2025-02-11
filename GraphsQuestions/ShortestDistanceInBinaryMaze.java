package com.java.GraphsQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceInBinaryMaze {
    static class tuple{
        int first;
        int second;
        int third;

        public tuple(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }
    public int shortestPath(int[][] grid, int[] src, int[] destination){
        if (src[0] == destination[0] && src[1] ==  destination[1]) return 0;

        Queue<tuple> queue = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;

        int[][] dist = new int[n][m];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                dist[i][j] =  (int) 1e9;
            }
        }
        dist[src[0]][src[1]] = 0;
        queue.add(new tuple(0, src[0], src[1]));

        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};
        while (!queue.isEmpty()){
            tuple neighbor = queue.peek();
            queue.remove();
            int dis = neighbor.first;
            int row = neighbor.second;
            int col = neighbor.third;

            for (int i = 0; i < 4; i++) {
                int newrow = row + drow[i];
                int newcol = col + dcol[i];

                if(newrow >= 0 && newrow < n && newcol >= 0 && newcol < m
                        && grid[newrow][newcol] == 1 && dis + 1 < dist[newrow][newcol]) {
                    dist[newrow][newcol] = 1 + dis;

                    if(newrow == destination[0] &&
                            newcol == destination[1]) return dis + 1;
                    queue.add(new tuple(1+dis, newrow, newcol));
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] source={0,1};
        int[] destination={2,2};

        int[][] grid={{1, 1, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0},
                {1, 0, 0, 1}};

        ShortestDistanceInBinaryMaze obj = new ShortestDistanceInBinaryMaze();
        int result = obj.shortestPath(grid, source, destination);

        System.out.print(result);
        System.out.println();
    }
}
