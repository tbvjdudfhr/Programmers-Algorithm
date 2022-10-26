package level2.courierbox;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int[] order) {
        Deque<Integer> container = new LinkedList<>();
        IntStream.rangeClosed(1, order.length).forEach(container::push);
        Deque<Integer> tmpContainer = new LinkedList<>();

        int cnt = 0;
        while (!container.isEmpty()) {
            if (order[cnt] != container.getLast()) {
                if (!tmpContainer.isEmpty() && order[cnt] == tmpContainer.peek()) {
                    cnt += 1;
                    tmpContainer.pop();
                } else {
                    tmpContainer.push(container.pollLast());
                }
            } else {
                cnt += 1;
                container.removeLast();
            }
        }

        while (!tmpContainer.isEmpty()) {
            if (order[cnt] == tmpContainer.peek()) {
                cnt += 1;
                tmpContainer.pop();
            } else break;
        }

        return cnt;
    }
}
