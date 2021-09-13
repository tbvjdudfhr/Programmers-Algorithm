package inflearn._2_11;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt() + 1;
        int[][] arr = new int[input][6];
        for (int i = 1; i < input; i++) {
            for (int j = 1; j < 6; j++) {
                int x = kb.nextInt();
                arr[i][j] = x;
            }
        }
        System.out.print(soluton(arr));
        return;
    }

    private static int soluton(int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 1; j < arr.length; j++) {
                for(int k = 1; k < 6; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
}
