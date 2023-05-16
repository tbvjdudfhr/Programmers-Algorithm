package pccp2._4.보물지도;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static int[] oneJumpX = {1, -1, 0, 0};
    static int[] oneJumpY = {0, 0, -1, 1};
    static int[] twoJumpX = {2, -2, 0, 0};
    static int[] twoJumpY = {0, 0, -2, 2};

    public int solution(int n, int m, int[][] hole) {
        int startX = m;
        int startY = 1;
        int endX = 1;
        int endY = n;
        int k = 1;

        boolean[][][] visited = new boolean[m + 1][n + 1][k + 1];
        boolean[][] MAP = new boolean[m + 1][n + 1];

        for (int[] h : hole) {
            int x = startX - h[1] + 1;
            int y = h[0];
            MAP[x][y] = true;
        }

        Queue<Node> pq = new LinkedList<>();
        pq.add(new Node(startX, startY, 0, k));
        visited[startX][startY][k] = true;
        int min = Integer.MAX_VALUE;

        while (!pq.isEmpty()) {
            Node nd = pq.poll();

            if (nd.x == endX && nd.y == endY) {
                min = Math.min(min, nd.time);
            }

            for (int i = 0; i < 4; i++) {
                int n1x = nd.x + oneJumpX[i];
                int n1y = nd.y + oneJumpY[i];

                if (n1x > m || n1y > n || n1x < 1 || n1y < 1 || visited[n1x][n1y][nd.cnt] || MAP[n1x][n1y]) {
                    continue;
                }

                visited[n1x][n1y][nd.cnt] = true;
                pq.offer(new Node(n1x, n1y, nd.time + 1, nd.cnt));
            }

            if (nd.cnt > 0) {
                for (int i = 0; i < 4; i++) {
                    int n2x = nd.x + twoJumpX[i];
                    int n2y = nd.y + twoJumpY[i];
                    if (n2x > m || n2y > n || n2x < 1 || n2y < 1 || visited[n2x][n2y][nd.cnt - 1] || MAP[n2x][n2y]) {
                        continue;
                    }
                    visited[n2x][n2y][nd.cnt - 1] = true;
                    pq.offer(new Node(n2x, n2y, nd.time + 1, nd.cnt - 1));
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }

    static class Node {
        int time;
        int x;
        int y;
        int cnt;

        public Node(int x, int y, int time, int cnt) {
            this.x = x;
            this.y = y;
            this.time = time;
            this.cnt = cnt;
        }
    }
}