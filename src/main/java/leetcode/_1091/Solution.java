package leetcode._1091;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int length = grid.length;
        if (grid[0][0] == 1 || grid[length - 1][length - 1] == 1) {
            return -1;
        }

        boolean[][] visited = new boolean[length][length];
        visited[0][0] = true; 
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0}); 
        int answer = 1;
        
        while (!queue.isEmpty()) { 
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] pop = queue.poll(); 
                if (pop[0] == length - 1 && pop[1] == length - 1) { 
                    return answer;
                }
                for (int j = 0; j < 8; j++) { 
                    int nextX = dx[j] + pop[0];
                    int nextY = dy[j] + pop[1];
                    if (isInRange(length, nextX, nextY) && !visited[nextX][nextY] && grid[nextX][nextY] == 0) {
                        queue.add(new int[]{nextX, nextY});
                        visited[nextX][nextY] = true;
                    }
                }
            }
            answer++;
        }

        return -1;
    }

    private boolean isInRange(int length, int nextX, int nextY) {
        return nextX >= 0 && nextX < length && nextY >= 0 && nextY < length;
    }
}
