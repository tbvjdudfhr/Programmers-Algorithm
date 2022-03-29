package inflearn._5_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.print(solution(n, k));

        return;
    }

    public static int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }

            answer = queue.poll();
        }

        return answer;
    }
}
