package inflearn._5_4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String line = kb.next();
        System.out.print(solution(line));

        return;
    }

    private static String solution(String line) {
        String answer = "";
        Stack<Integer> stack = new Stack<>();
        for (char x : line.toCharArray()) {
            int lt, rt;
            if (Character.isDigit(x)) stack.push(Character.getNumericValue(x));
            else {
                rt = stack.pop();
                lt = stack.pop();
                if (x == '+') stack.push(lt + rt);
                else if (x == '-') stack.push(lt - rt);
                else if (x == '*') stack.push(lt * rt);
                else if (x == '/') stack.push(lt / rt);
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i).toString();
        }
        return answer;
    }
}
