package inflearn._2_4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.print(soluton(i) + " ");
        }
        return;
    }

    private static int soluton(int n) {
        int[] arr = new int[n + 1];
        if (n < 2) arr[n] = 1;
        else  arr[n] = soluton(n-1) + soluton(n-2);
        return arr[n];
    }
}
