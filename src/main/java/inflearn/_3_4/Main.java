package inflearn._3_4;

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
        int sum = 0, cnt = 0, lt = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum >= m) {
                if (sum == m) cnt++;
                sum -= arr[lt];
                lt++;
            }
        }
        return cnt;
    }
}
// 8 6
// 1 2 1 3 1 1 1 2
// 3