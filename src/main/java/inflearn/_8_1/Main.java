package inflearn._8_1;

import java.util.Scanner;

public class Main {
    static String answer = "NO";
    static int n, total = 0;
    static boolean flag = false;

    public static void DFS(int L, int sum, int[] arr) {
        if (flag) return;
        if (sum > total / 2) return;
        if (L == n) {
            if (total - sum == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = kb.nextInt();
            total += ints[i];
        }
        DFS(0, 0, ints);

        System.out.println(answer);

        return;
    }
}
