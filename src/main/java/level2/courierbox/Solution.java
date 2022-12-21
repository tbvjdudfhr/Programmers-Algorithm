package level2.courierbox;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public int solution(int[] order) {
        int answer;
        int cnt = 0;

        Stack<Integer> tmpContainer = new Stack<>();
        Queue<Integer> container = new LinkedList<>();

        for (int i = 0; i < order.length; i++) {
            tmpContainer.add(i + 1);

            while (!tmpContainer.isEmpty()) {
                if (tmpContainer.peek() == order[cnt]) {
                    container.offer(tmpContainer.pop());
                    cnt++;
                } else break;

            }
        }
        answer = container.size();
        return answer;
    }
}
