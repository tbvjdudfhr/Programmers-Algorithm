package pccp2._1.실습용로봇;

public class Solution {
    public int[] solution(String command) {
        int[] answer = new int[2];
        int[][] path = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int x = 0;
        int y = 0;
        int d = 0;
        for (char c : command.toCharArray()) {
            switch (c) {
                case 'R':
                    d = (d + 1) % 4;
                    break;
                case 'L':
                    d = (d + 3) % 4;
                    break;
                case 'G':
                    x += path[d][0];
                    y += path[d][1];
                    break;
                case 'B':
                    x -= path[d][0];
                    y -= path[d][1];
                    break;
            }
        }

        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}
