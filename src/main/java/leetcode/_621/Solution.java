package leetcode._621;

import java.util.*;

public class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> counts = new HashMap();
        for (char t : tasks) {
            counts.put(t, counts.getOrDefault(t, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue(counts.size(), Collections.reverseOrder());
        pq.addAll(counts.values());
        int res = 0;
        while (!pq.isEmpty()) {
            int time = 0;
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < n + 1; ++i) {
                if (!pq.isEmpty()) {
                    tmp.add(pq.remove() - 1);
                    time++;
                }
            }
            for (int t : tmp) {
                if (t > 0) pq.add(t);
            }
            res += pq.isEmpty() ? time : n + 1;
        }
        return res;
    }
}
