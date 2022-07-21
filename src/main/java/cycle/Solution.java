package cycle;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[][] visited;
    public int row;
    public int column;

    public int[] solution(String[] grid) {
        ArrayList<Integer> list = new ArrayList<>();
        visited = new int[grid.length][grid[0].length()];
        column = grid.length;
        row = grid[0].length();

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                for (int d = 0; d < 4; d++) {
                    if ((visited[i][j] & (1 << d)) == 1 << d) {
                        continue;
                    }
                    int cnt = bfs(i, j, d, grid);
                    list.add(cnt);
                }
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public int bfs(int x, int y, int d, String[] grid) {
        int[] dirX = {0, 1, 0, -1};
        int[] dirY = {1, 0, -1, 0};

        int cnt = 0;

        while (true) {
            if ((visited[x][y] & (1 << d)) == 1 << d) {
                break;
            }
            cnt++;
            visited[x][y] |= (1 << d);

            if (grid[x].charAt(y) == 'L') {
                d = d == 0 ? 3 : d - 1;
            } else if (grid[x].charAt(y) == 'R') {
                d = d == 3 ? 0 : d + 1;
            }

            x = (x + dirX[d] + column) % column;
            y = (y + dirY[d] + row) % row;
        }

        return cnt;
    }
}
