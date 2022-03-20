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

    public static String solution(String line, String line2) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        getMap(line, map);
        getMap(line2, map2);

        if (map.equals(map2)) {
            return "YES";
        }

        return "No";
    }

    private static void getMap(String line, HashMap<Character, Integer> map) {
        for (char x : line.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
    }
}
