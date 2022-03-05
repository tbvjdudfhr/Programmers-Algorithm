package inflearn._2_5;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        System.out.print(soluton(input));

        return;
    }

    public static int soluton(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < 2) arr[i] = 0;
            else arr[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                arr[j] = 0;
            }
        }

        for (int x : arr) {
            if (x != 0) answer++;
        }
        return answer;
    }
}
