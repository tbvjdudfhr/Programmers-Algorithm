package inflearn._2_12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input1 = kb.nextInt();
        int input2 = kb.nextInt();
        int[][] arr = new int[input2][input1];
        for (int i = 0; i < input2; i++) {
            for (int j = 0; j < input1; j++) {
                int x = kb.nextInt();
                arr[i][j] = x;
            }
        }
        System.out.print(soluton(input2, input1, arr));
        return;
    }

    private static int soluton(int a, int b, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= b; j++) {
                int cnt = 0;
                for (int k = 0; k < a; k++) {
                    int pi = 0, pj = 0;
                    for (int l = 0; l < b; l++) {
                        if(arr[k][l] == i) pi = l;
                        if(arr[k][l] == j) pj = l;
                    }
                    if(pi < pj) cnt++;
                }
                if (cnt == a) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
