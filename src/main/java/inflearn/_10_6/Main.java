package inflearn._10_6;


import java.util.Scanner;

public class Main {
    static int number, time;
    static int[] dp;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        number = kb.nextInt();
        time = kb.nextInt();
        dp = new int[time + 1];
        for (int i = 0; i < number; i++) {
            int ps = kb.nextInt();
            int pt = kb.nextInt();
            for (int j = time; j >= pt; j--) {
                dp[j] = Math.max(dp[j], dp[j - pt] + ps);
            }
        }

        System.out.println(dp[time]);
    }
}
