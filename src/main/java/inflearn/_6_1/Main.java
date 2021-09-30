package inflearn._6_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = kb.nextInt();
        }
        System.out.print(solution(n, ints));
        return;
    }

    private static String solution(int n, int[] ints) {
        String answer = "";
        for (int i = 0; i < ints.length; i++) {
            int idx = i;
            for (int j = i + 1; j < ints.length; j++) {
                if(ints[j] < ints[idx]) idx = j;
            }
            int tmp = ints[i];
            ints[i] = ints[idx];
            answer += ints[idx] + " ";
            ints[idx] = tmp;
        }
        return answer;
    }
}
