package inflearn._5_2;

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
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : line.toCharArray()) {
            if (x != ')') stack.push(x);
            else while (stack.pop() != '(') ;
        }

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }
}
