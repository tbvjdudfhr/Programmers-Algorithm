package inflearn._3_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.print(solution(n, m, arr));

        return;
    }

    private static int solution(int n, int m, int[] arr) {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        int max = sum;
        for (int i = m; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - m];
            if (max < sum) max = sum;
        }
        return max;
    }
}
