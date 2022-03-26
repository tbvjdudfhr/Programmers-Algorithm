package inflearn._5_3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = kb.nextInt();
        }
        System.out.print(solution(board, moves));

        return;
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            int tmp = moves[i];
            for (int j = 0; j < board.length; j++) {
                int cnt = board[j][tmp - 1];
                if (cnt != 0) {
                    if (!stack.isEmpty() && stack.peek() == cnt) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(cnt);
                    }
                    board[j][tmp - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
