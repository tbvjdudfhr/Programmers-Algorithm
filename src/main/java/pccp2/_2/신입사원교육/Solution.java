package pccp2._2.신입사원교육;

import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] ability, int number) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int a : ability) {
            pq.offer(a);
        }
        for (int i = 0; i < number; i++) {
            int first = pq.poll();
            int second = pq.poll();
            pq.offer(first + second);
            pq.offer(first + second);
        }
        int sum = 0;
        for (int a : pq) {
            sum += a;
        }
        return sum;
    }
}