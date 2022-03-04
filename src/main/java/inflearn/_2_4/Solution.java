package inflearn._2_4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        for (int i = 1; i <= input; i++) {
            System.out.print(soluton(i) + " ");
        }

        return;
    }

    public static int soluton(int n) {
        if(n <= 1) {
            return n;
        }

        return soluton(n-2) + soluton(n - 1);
    }
}
