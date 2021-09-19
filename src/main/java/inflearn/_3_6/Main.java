package inflearn._3_6;

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
        int cnt = 0, lt = 0, len = 0, max = Integer.MIN_VALUE;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                cnt++;
            }
            while (cnt > m) {
                lt++;
                if (arr[lt] == 0) {
                    cnt--;
                }
            }
            len = rt - lt;
            if(max < len) max = len;
        }
        return max;
    }
}
