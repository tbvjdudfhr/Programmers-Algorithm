package inflearn._5_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = kb.nextInt();
        }
        System.out.print(solution(m, ints));

        return;
    }

    public static int solution(int m, int[] ints) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < ints.length; i++) {
            queue.add(new Person(i, ints[i]));
        }

        int cnt = 0;
        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person p : queue) {
                if (tmp.priority < p.priority) {
                    queue.add(tmp);
                    tmp = null;
                    break;
                }
            }

            if (tmp != null) {
                cnt++;
                if (tmp.id == m) {
                    answer = cnt;
                    break;
                }
            }
        }

        return answer;
    }

    private static class Person {
        int id;
        int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }
}
