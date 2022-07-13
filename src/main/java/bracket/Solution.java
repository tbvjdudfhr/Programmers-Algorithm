package bracket;

import java.util.Stack;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = s;

        for (int i = 0; i < s.length(); i++) {
            str = str.substring(1) + str.charAt(0);
            if (isCorrect(str)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean isCorrect(String str) {
        Stack<Character> s = new Stack<>();

        char[] arr = str.toCharArray();

        for (char data : arr) {
            if (s.isEmpty()) {
                s.push(data);
            } else if (s.peek() == '[' && data == ']') {
                s.pop();
            } else if (s.peek() == '(' && data == ')') {
                s.pop();
            } else if (s.peek() == '{' && data == '}') {
                s.pop();
            } else {
                s.push(data);
            }
        }

        if (s.isEmpty()) {
            return true;
        }

        return false;
    }
}
