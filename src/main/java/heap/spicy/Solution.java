package heap.spicy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> integers = Arrays.stream(scoville).boxed().collect(Collectors.toCollection(PriorityQueue::new));
        while (integers.peek() < K) {
            if(integers.size() < 2) return -1;
            answer++;
            integers.add(getNewScoville(integers.poll(), integers.poll()));
        }
        return answer;
    }

    private Integer getNewScoville(Integer a, Integer b) {
        return a + (b * 2);
    }
}
