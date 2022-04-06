package inflearn._6_6;

import java.util.Arrays;
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
        int[] sortedInts = ints.clone();

        Arrays.sort(sortedInts);
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != sortedInts[i]) answer += i + 1 + " ";
        }
        return answer;
    }
}
