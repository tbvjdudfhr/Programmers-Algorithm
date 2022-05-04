package inflearn._10_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] dp;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        int[] numbers = new int[input];
        dp = new int[input];
        for (int i = 0; i < input; i++) {
            numbers[i] = kb.nextInt();
        }
        solution(numbers);
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }

    public static void solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (dp[j] > max && numbers[i] > numbers[j]) {
                    max = dp[j];
                }
            }
            dp[i] = max + 1;
        }
    }
}
