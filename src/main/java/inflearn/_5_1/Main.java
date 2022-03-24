package inflearn._5_1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String line = kb.next();
        System.out.print(solution(line));

        return;
    }

    public static String solution(String line) {
        Stack<Character> stack = new Stack<>();
        for (char x : line.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } else stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return "NO";
        }

        return "YES";
    }
}
