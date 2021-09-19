package inflearn._4_2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String line = kb.next();
        String line2 = kb.next();
        System.out.print(solution(line, line2));

        return;
    }

    private static String solution(String line, String line2) {
        String answer = "NO";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char x : line.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : line2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        if(map.equals(map2)) answer = "YES";

        return answer;
    }
}
