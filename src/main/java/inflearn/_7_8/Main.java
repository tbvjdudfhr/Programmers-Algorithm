package inflearn._7_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static int[] ck;
    private static int[] move = {1, -1, 5};

    public static int bfs(int s, int e) {
        ck = new int[10001];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        ck[s] = 1;
        int jumpCnt = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int current = queue.poll();
                for (int m : move) {
                    int nextJump = current + m;
                    if (e == nextJump) return jumpCnt + 1;
                    if (1 <= nextJump && nextJump <= 100000 && ck[nextJump] == 0) {
                        queue.offer(nextJump);
                        ck[nextJump] = 1;
                    }
                }
            }
            jumpCnt++;
        }

        return jumpCnt;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        System.out.print(bfs(n, m));
        return;
    }
}
