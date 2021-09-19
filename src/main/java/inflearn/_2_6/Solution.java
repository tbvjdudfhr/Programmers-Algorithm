package inflearn._2_6;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        for (int i = 0; i < input; i++) {
            String s = kb.next();
            StringBuilder sb = new StringBuilder(s);
            int n = Integer.parseInt(sb.reverse().toString());
            if(soluton(n)) System.out.print(n + " ");
        }
        return;
    }

    private static boolean soluton(int n) {
        boolean answer = false;
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

        if(arr[n] != 0) answer = true;

        return answer;
    }
}
