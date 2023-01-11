package dfsbfs.단지번호붙이기;

import java.util.ArrayList;

public class Solution {
    int count;
    int dirX[] = {0, 0, 1, -1};
    int dirY[] = {1, -1, 0, 0};

    public ArrayList<Integer> solution(int[][] graph) {
        int length = graph.length;
        ArrayList<Integer> countList = new ArrayList<>();

        for (int i = 1; i < length; i++) {
            for (int j = 1; j < length; j++) {
                if (graph[i][j] == 1) {
                    count = 0;
                    dfs(i, j, graph);
                    countList.add(count);
                }
            }
        }
        return countList;
    }

    private void dfs(int x, int y, int[][] graph) {
        graph[x][y] = 0;
        count++;
        for (int i = 0; i < 4; i++) {
            int newX = x + dirX[i];
            int newY = y + dirY[i];
            if (newX >= 0 && newX < graph.length && newY >= 0 && newY < graph.length && graph[newX][newY] == 1) {
                dfs(newX, newY, graph);
            }
        }
    }
}
