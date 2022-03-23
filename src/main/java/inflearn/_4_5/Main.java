package inflearn._4_5;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

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
        int answer = -1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                for (int k = j + 1; k < ints.length; k++) {
                    set.add(ints[i] + ints[j] + ints[k]);
                }
            }
        }

        int cnt = 0;
        for (int x : set) {
            cnt++;
            if (cnt == m) answer = x;
        }

        return answer;
    }
}
