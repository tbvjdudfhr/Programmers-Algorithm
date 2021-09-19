package inflearn._2_10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt() + 2;
        int[][] arr = new int[input][input];
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if (i == 0 || j == 0 || i == input -1 || j == input - 1) arr[i][j] = 0;
                else {
                    int x = kb.nextInt();
                    arr[i][j] = x;
                }
            }
        }
        System.out.print(soluton(arr));
        return;
    }

    private static int soluton(int[][] arr) {
        int answer = 0;
        int temp = arr.length;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i][j + 1])
                    answer++;
            }
        }
        return answer;
    }
}
