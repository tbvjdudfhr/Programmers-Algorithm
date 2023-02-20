package level2.미로탈출;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int n, m;

    static boolean isRange(int y, int x) {
        return 0 <= y && y < n && 0 <= x && x < m;
    }

    static int bfs(char start, char end, String[] maps) {
        int y = 0, x = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maps[i].charAt(j) == start) {
                    y = i;
                    x = j;
                }
            }
        }
        int[][] check = new int[100][100];
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(y, x, 0));
        while (!q.isEmpty()) {
            Tuple t = q.poll();
            y = t.y;
            x = t.x;
            int cnt = t.cnt;
            if (maps[y].charAt(x) == end) return cnt;
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                if (isRange(ny, nx) && check[ny][nx] == 0 && maps[ny].charAt(nx) != 'X') {
                    q.offer(new Tuple(ny, nx, cnt + 1));
                    check[ny][nx] = 1;
                }
            }
        }
        return -1;
    }

    public static int solution(String[] maps) {
        int answer = 0;
        n = maps.length;
        m = maps[0].length();
        int a = bfs('S', 'L', maps);
        int b = bfs('L', 'E', maps);
        if (a == -1 || b == -1) return -1;
        return a + b;
    }
}

class Tuple {
    int y, x, cnt;

    Tuple(int y, int x, int cnt) {
        this.y = y;
        this.x = x;
        this.cnt = cnt;
    }
}