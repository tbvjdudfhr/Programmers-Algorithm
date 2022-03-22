package inflearn._4_4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
        String m = kb.next();
        System.out.print(solution(n, m));
        return;
    }

    public static int solution(String n, String m) {
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char x : m.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < m.length() - 1; i++) {
            map.put(n.charAt(i), map.getOrDefault(n.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = m.length() - 1; rt < n.length(); rt++) {
            map.put(n.charAt(rt), map.getOrDefault(n.charAt(rt), 0) + 1);
            if (map.equals(map2)) answer++;
            map.put(n.charAt(lt), map.get(n.charAt(lt)) - 1);
            if (map.get(n.charAt(lt)) == 0) map.remove(n.charAt(lt));
            lt++;
        }
        return answer;
    }
}
