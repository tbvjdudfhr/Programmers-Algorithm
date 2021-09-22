package inflearn._8_2;

import java.util.Scanner;

public class Main {
    static int n, maxWeight = 0, weight = Integer.MIN_VALUE;

    public static void DFS(int L, int sum, int[] arr) {
        if (sum > maxWeight) return;
        if (L == n) {
            weight = Math.max(weight, sum);
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        maxWeight = kb.nextInt();
        n = kb.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = kb.nextInt();
        }
        DFS(0, 0, ints);

        System.out.println(weight);

        return;
    }
}
