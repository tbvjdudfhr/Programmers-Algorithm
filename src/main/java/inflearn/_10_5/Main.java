package inflearn._10_5;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int numberCoins, changeMoney;
    static int[] dp;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        numberCoins = kb.nextInt();
        int[] typesCoins = new int[numberCoins];
        for (int i = 0; i < numberCoins; i++) {
            typesCoins[i] = kb.nextInt();
        }
        changeMoney = kb.nextInt();
        dp = new int[changeMoney + 1];
        System.out.println(solution(typesCoins));
    }

    private static int solution(int[] typesCoins) {
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int typeCoin : typesCoins) {
            for (int i = typeCoin; i <= changeMoney; i++) {
                dp[i] = Math.min(dp[i], dp[i - typeCoin] + 1);
            }
        }
        return dp[changeMoney];
    }
}
