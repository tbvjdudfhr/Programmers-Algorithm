package level2.makinghamburgers;

import java.util.Stack;

public class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);
            if (stack.size() >= 4 && stack.peek() == 1) {
                int size = stack.size();
                if (stack.get(size - 1) == 1 && stack.get(size - 2) == 3 && stack.get(size - 3) == 2 && stack.get(size - 4) == 1) {
                    int count = 0;
                    while (count < 4) {
                        stack.pop();
                        count++;
                    }
                    answer++;
                }
            }
        }
        return answer;
    }
}
