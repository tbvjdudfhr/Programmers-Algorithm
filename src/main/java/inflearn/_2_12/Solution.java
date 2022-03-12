package inflearn._2_12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numberStudents = kb.nextInt();
        int schoolClass = kb.nextInt();
        int[][] arr = new int[schoolClass][numberStudents];
        for (int i = 0; i < schoolClass; i++) {
            for (int j = 0; j < numberStudents; j++) {
                int x = kb.nextInt();
                arr[i][j] = x;
            }
        }
        System.out.print(soluton(arr));
        return;
    }

    public static int soluton(int[][] arr) {
        int answer = 0;
        int rowCount = arr.length;
        int columnCount = arr[0].length;
        for (int i = 1; i <= columnCount; i++) {
            for (int j = 1; j <= columnCount; j++) {
                int cnt = 0;
                for (int k = 0; k < rowCount; k++) {
                    int pi = 0, pj = 0;
                    for (int l = 0; l < columnCount; l++) {
                        if (arr[k][l] == i) pi = l;
                        if (arr[k][l] == j) pj = l;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == rowCount) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
