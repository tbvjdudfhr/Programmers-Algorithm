package inflearn._8_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int[][] dis;
    static int answer = 0;

    private static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        board[x][y] = 1;

        while (!queue.isEmpty()) {
            Point tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = tmp.x + dx[i];
                int nextY = tmp.y + dy[i];
                if (nextX >= 1 && nextX <= 7 && nextY >= 1 && nextY <= 7 && board[nextX][nextY] == 0) {
                    dis[nextX][nextY] = dis[tmp.x][tmp.y] + 1;
                    board[nextX][nextY] = 1;
                    queue.add(new Point(nextX, nextY));
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        board = new int[8][8];
        dis = new int[8][8];

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        BFS(1, 1);

        int result = dis[7][7];
        if (result == 0) System.out.println(-1);
        else System.out.println(result);

        return;
    }
}
