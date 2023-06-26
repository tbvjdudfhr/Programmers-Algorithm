package bookpractice.chapter6.소수찾기;

import java.util.*;

public class Solution {
    private boolean[] isPrime;

    public int solution(String numbers) {
        int answer = 0;

        Set<Integer> candidates = new HashSet<>();
        for (int i = 1; i <= numbers.length(); i++) {
            generateNumbers(numbers, i, new StringBuilder(), candidates, new boolean[numbers.length()]);
        }

        int maxNum = Collections.max(candidates);
        isPrime = new boolean[maxNum + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(maxNum); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxNum; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int num : candidates) {
            if (isPrime[num]) {
                answer++;
            }
        }

        return answer;
    }

    private void generateNumbers(String numbers, int length, StringBuilder current, Set<Integer> candidates, boolean[] visited) {
        if (current.length() == length) {
            candidates.add(Integer.parseInt(current.toString()));
            return;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                current.append(numbers.charAt(i));
                generateNumbers(numbers, length, current, candidates, visited);
                current.deleteCharAt(current.length() - 1);
                visited[i] = false;
            }
        }
    }
}