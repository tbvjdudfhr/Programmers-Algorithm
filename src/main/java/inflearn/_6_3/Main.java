package inflearn._6_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = kb.nextInt();
        }
        System.out.print(solution(ints));
        return;
    }

    public static String solution(int[] ints) {
        String answer = "";
        for (int i = 1; i < ints.length; i++) {
            int target = ints[i];

            int j = i - 1;
            while (j >= 0 && target < ints[j]) {
                ints[j + 1] = ints[j];
                j--;
            }

            ints[j + 1] = target;
        }

        for (int x : ints) {
            answer += x + " ";
        }
        return answer;
    }
}
