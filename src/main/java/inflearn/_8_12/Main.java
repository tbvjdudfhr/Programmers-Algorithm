package inflearn._8_12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int[][] dis;
    static int n, m, answer = 0;
    static Queue<Point> queue = new LinkedList<>();

    private static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void BFS() {

        while (!queue.isEmpty()) {
            Point tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = tmp.x + dx[i];
                int nextY = tmp.y + dy[i];
                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && board[nextX][nextY] == 0) {
                    dis[nextX][nextY] = dis[tmp.x][tmp.y] + 1;
                    board[nextX][nextY] = 1;
                    queue.add(new Point(nextX, nextY));
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        m = kb.nextInt();
        n = kb.nextInt();

        board = new int[n][m];
        dis = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = kb.nextInt();
                board[i][j] = x;
                if (x == 1) queue.add(new Point(i, j));
            }
        }

        BFS();

        for (int[] row : board) {
            for (int r : row) {
                if (r == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        for (int[] row : dis) {
            for (int r : row) {
                answer = Math.max(answer, r);
            }
        }

        System.out.println(answer);
        return;
    }
}
