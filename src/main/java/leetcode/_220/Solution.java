package leetcode._220;

public class Solution {
    char[][] map;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int numIslands(char[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int answer = 0;
        map = grid;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (map[i][j] == '1') {
                    map[i][j] = '0';
                    answer++;
                    dfs(i, j, map);
                }
            }
        }

        return answer;
    }

    private void dfs(int i, int j, char[][] map) {
        for (int k = 0; k < dx.length; k++) {
            int nextX = i + dx[k];
            int nextY = j + dy[k];
            if (nextX >= 0 && nextX < map.length && nextY >= 0 && nextY < map[0].length && map[nextX][nextY] == '1') {
                map[nextX][nextY] = '0';
                dfs(nextX, nextY, map);
            }
        }
    }
}