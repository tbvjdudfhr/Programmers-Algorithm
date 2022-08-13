package inflearn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int number = kb.nextInt();
        int[][] ints = new int[number + 2][number + 2];
        for (int i = 1; i < number +1; i++) {
            for (int j = 1; j < number+1; j++) {
                ints[i][j] = kb.nextInt();
            }
        }

        int cnt = 0;
        for (int i = 1; i < number + 1; i++) {
            for (int j = 1; j < number + 1; j++) {
                int num = ints[i][j];
                if(num > ints[i-1][j] && num > ints[i][j +1] && num > ints[i+1][j] && num > ints[i][j-1]) cnt++;
            }
        }
        System.out.println(cnt);
    }
}