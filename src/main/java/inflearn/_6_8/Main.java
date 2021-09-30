package inflearn._6_8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = kb.nextInt();
        }
        System.out.print(solution(m, ints));
        return;
    }

    private static String solution(int m, int[] ints) {
        Arrays.sort(ints);

        int lt = 0, rt = ints.length;
        while (true) {
            int tmp = (lt + rt) / 2;
            if(m == ints[tmp]) return tmp + 1 + "";
            else if(m < ints[tmp]) rt = tmp - 1;
            else lt = tmp + 1;
        }
    }
}