package inflearn._2_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        int[][] arr = new int[input][input];
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                int x = kb.nextInt();
                arr[i][j] = x;
            }
        }
        System.out.print(soluton(arr));
        return;
    }

    public static int soluton(int[][] arr) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int row = 0, column = 0;
            for (int j = 0; j < arr.length; j++) {
                row += arr[i][j];
                column += arr[j][i];
            }
            list.add(row);
            list.add(column);
        }

        int xy = 0, yx = 0;
        for (int i = 0; i < arr.length; i++) {
            xy += arr[i][i];
            yx += arr[arr.length - 1 - i][arr.length - 1 - i];
        }
        list.add(xy);
        list.add(yx);

        answer = Collections.max(list);

        return answer;
    }
}
