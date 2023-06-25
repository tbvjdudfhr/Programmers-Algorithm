package bookpractice.chapter6.수식최대화;

import java.util.ArrayList;

public class Solution {
    static char[] operators = {'+', '-', '*'};
    static char[] operatorPriority;
    static boolean[] visited;
    static ArrayList<Long> numbers;
    static ArrayList<Character> operatorSequence;
    static long answer;

    public long solution(String expression) {
        operatorPriority = new char[3];
        visited = new boolean[3];
        numbers = new ArrayList<>();
        operatorSequence = new ArrayList<>();

        StringBuilder num = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                num.append(ch);
            } else {
                numbers.add(Long.parseLong(num.toString()));
                num.setLength(0);
                operatorSequence.add(ch);
            }
        }
        numbers.add(Long.parseLong(num.toString()));

        permutation(0);

        return answer;
    }

    public void permutation(int depth) {
        if (depth == 3) {
            long result = calculate();
            answer = Math.max(answer, Math.abs(result));
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (!visited[i]) {
                visited[i] = true;
                operatorPriority[depth] = operators[i];
                permutation(depth + 1);
                visited[i] = false;
            }
        }
    }

    public long calculate() {
        ArrayList<Long> tempNumbers = new ArrayList<>(numbers);
        ArrayList<Character> tempOperatorSequence = new ArrayList<>(operatorSequence);

        for (char op : operatorPriority) {
            for (int i = 0; i < tempOperatorSequence.size(); i++) {
                if (tempOperatorSequence.get(i) == op) {
                    long num1 = tempNumbers.get(i);
                    long num2 = tempNumbers.get(i + 1);
                    long result;

                    if (op == '+') {
                        result = num1 + num2;
                    } else if (op == '-') {
                        result = num1 - num2;
                    } else {
                        result = num1 * num2;
                    }

                    tempNumbers.remove(i + 1);
                    tempNumbers.set(i, result);
                    tempOperatorSequence.remove(i);
                    i--;
                }
            }
        }

        return tempNumbers.get(0);
    }
}
