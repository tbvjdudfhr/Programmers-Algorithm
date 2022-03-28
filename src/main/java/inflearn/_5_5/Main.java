package inflearn._5_5;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String line = kb.next();
        System.out.print(solution(line));

        return;
    }

    public static int solution(String line) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char preX = '(';
        for (char x : line.toCharArray()) {
            if (x == '(') stack.push(x);
            else if (preX == ')') {
                stack.pop();
                answer += 1;
            } else {
                stack.pop();
                answer += stack.size();
            }
            preX = x;
        }

        return answer;
    }
}
