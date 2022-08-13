package weekly.puzzle;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    class Point {
        Point (int row, int col) {
            this.row = row;
            this.col = col;
        }
        int row, col;
    }
    Queue<Point[]> queue = new LinkedList<>();
    boolean[][] visited = new boolean[50][50];

    public int solution(int[][] game_board, int[][] table) {
        int answer = -1;


        return answer;
    }

    public void bfs(int x, int y) {
        queue.add(new Point[]{new Point(x, y)});
        visited[x][y] = true;

    }
}