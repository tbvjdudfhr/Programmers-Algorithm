package pccp2._3.카페확장;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int[] menu, int[] order, int k) {
        int answer = 0;
        int n = order.length;
        Queue<Integer> queue = new LinkedList<>();
        int i = 0;
        int time = 0;

        while (!queue.isEmpty() || i < n) {
            if (queue.isEmpty()) {
                time = (i * k) + menu[order[i]];
                i++;
            } else {
                int x = queue.poll();
                time += menu[x];
            }
            while (i < n && i <= ((time - 1) / k)) {
                queue.offer(order[i]);
                i++;
            }
            answer = Math.max(answer, queue.size());
        }

        return answer + 1;
    }
}
