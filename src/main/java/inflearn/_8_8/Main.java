package inflearn._8_8;

import java.util.Scanner;

public class Main {
    static int number;
    static int finalNumber;
    static int[] combinations;
    static int[] answer;
    static int[] check;
    static int[][] combinationMemory = new int[35][35];
    private static boolean flag = false;

    public static void dfs(int n, int sum) {
        if(flag) return;
        if (n == number) {
            if(sum == finalNumber) {
                for(int x : answer) System.out.print(x + " ");
                flag =true;
            }
        } else {
            for (int i = 1; i <= number; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    answer[n] = i;
                    dfs(n + 1, sum + answer[n] * combinations[n]);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        number = kb.nextInt();
        finalNumber = kb.nextInt();
        combinations = new int[number];
        answer = new int[number];
        check = new int[number + 1];
        for (int i = 0; i < number; i++) {
            combinations[i] = combination(number - 1, i);
        }
        dfs(0, 0);
        return;
    }

    private static int combination(int n, int r) {
        if (combinationMemory[n][r] != 0) return combinationMemory[n][r];
        if (n == r || r == 0) return 1;
        else return combinationMemory[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }
}
