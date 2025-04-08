package Restart.Graphs.DFS_BFS;

import java.util.*;

public class RottenOranges {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> que = new LinkedList<>();
        int freshOranges = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    ++freshOranges;
                } else if (grid[i][j] == 2) {
                    que.add(new int[] { i, j });
                }
            }
        }
        if (freshOranges == 0) {
            return 0;
        }
        if (que.isEmpty()) {
            return -1;
        }
        int time = 0;
        while (!que.isEmpty()) {
            int[][] direction = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
            int size = que.size();
            for (int i = 0; i < size; i++) {
                for (int d = 0; d < 4; d++) {
                    int x = que.peek()[0] + direction[d][0];
                    int y = que.peek()[1] + direction[d][1];
                    if (!(x >= grid.length || x < 0 || y < 0 || y >= grid[0].length || grid[x][y] != 1)) {
                        que.add(new int[] { x, y });
                        grid[x][y] = 2;
                        --freshOranges;
                    }
                }
                if (que.size() == 0) {
                    break;
                }
                que.poll();
            }
        }
        if (freshOranges != 0) {
            return -1;
        }
        return time;

    }
}
