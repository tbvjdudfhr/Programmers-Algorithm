package inflearn._10_2;

import java.util.Scanner;

public class Main {
    static int[] dp = new int[37];

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt() + 1;
        solution(input);
        System.out.println(dp[input]);
    }

    public static void solution(int input) {
        for (int i = 1; i <= input; i++) {
            if (i == 1) {
                dp[i] = 1;
            } else if (i == 2) {
                dp[i] = 2;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
    }
}
