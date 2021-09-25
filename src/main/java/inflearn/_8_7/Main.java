package inflearn._8_7;

import java.util.Scanner;

public class Main {

    static int[][] ints = new int[34][34];

    public static int DFS(int n, int r) {
        if (ints[n][r] != 0) return ints[n][r];
        if (r == 0 || n == r) return 1;
        else {
            return ints[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();

        System.out.println(DFS(n, r));

        return;
    }
}
