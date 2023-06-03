package bookpractice.chapter3.거리두기확인하기;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int[] solution(String[][] places) {
        List<Integer> answer = new ArrayList<>();

        for (String[] place : places) {
            List<Position> people = new ArrayList<>();
            for (int x = 0; x < 5; x++) {
                for (int y = 0; y < 5; y++) {
                    if (place[x].charAt(y) == 'P') {
                        people.add(new Position(x, y));
                    }
                }
            }

            int key = 1;
            for (Position person : people) {
                boolean[][] visited = new boolean[5][5];
                if (!bfs(place, person.getX(), person.getY(), visited)) {
                    key = 0;
                    break;
                }
            }
            answer.add(key);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean bfs(String[] place, int x, int y, boolean[][] visited) {

        Queue<Position> q = new LinkedList<>();
        q.add(new Position(x, y, 0));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Position position = q.poll();
            for (int d = 0; d < 4; d++) {
                int px = position.getX() + dx[d];
                int py = position.getY() + dy[d];

                if (0 <= px && px < 5 && 0 <= py && py < 5) {
                    if (visited[px][py] == false && place[px].charAt(py) != 'X') {
                        if (place[px].charAt(py) == 'P' && position.getCost() + 1 <= 2)
                            return false;
                        q.add(new Position(px, py, position.getCost() + 1));
                        visited[position.getX()][position.getY()] = true;
                    }
                }
            }
        }
        return true;
    }

    class Position {
        int x;
        int y;
        int cost;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Position(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getCost() {
            return cost;
        }
    }
}