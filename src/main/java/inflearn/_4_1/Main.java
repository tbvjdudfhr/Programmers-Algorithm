package inflearn._4_1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String line = kb.next();
        System.out.print(solution(n, line));

        return;
    }

    public static char solution(int n, String line) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : line.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        Character answer = 'a';
        for (char x : map.keySet()) {
            if (map.get(x) > max) {
                max = map.get(x);
                answer = x;
            }
        }
        return answer;
    }
}
