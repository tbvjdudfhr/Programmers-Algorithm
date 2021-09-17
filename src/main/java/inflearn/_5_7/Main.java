package inflearn._5_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
        String k = kb.next();
        System.out.print(solution(n, k));

        return;
    }

    private static String solution(String n, String k) {
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < n.length(); i++) {
            queue.offer(n.charAt(i));
        }

        for(char x : k.toCharArray()) {
            if(queue.isEmpty()) break;
            else if(queue.contains(x)) {
                if(queue.poll() != x) return "NO";
            }
        }
        
        if(!queue.isEmpty()) return  "NO";

        String answer = "YES";

        return answer;
    }
}
