package inflearn._8_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int n, changeMoney, changeCount = Integer.MAX_VALUE;
    static Integer[] typesCoins;

    public static void DFS(int L, int sum) {
        if (sum > changeMoney) return;
        if (L >= changeCount) return;
        if (sum == changeMoney) {
            changeCount = Math.min(changeCount, L);
        } else {
            for (int coin : typesCoins) {
                DFS(L + 1, sum + coin);
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        typesCoins = new Integer[n];
        for (int i = 0; i < n; i++) {
            typesCoins[i] = kb.nextInt();
        }
        Arrays.sort(typesCoins, Collections.reverseOrder());
        changeMoney = kb.nextInt();
        DFS(0, 0);

        System.out.println(changeCount);

        return;
    }
}
