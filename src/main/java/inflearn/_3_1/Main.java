package inflearn._3_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            list.add(x);
        }
        int m = kb.nextInt();
        for (int i = 0; i < m; i++) {
            int x = kb.nextInt();
            list.add(x);
        }
        Collections.sort(list);
        for (int i : list) {
            System.out.print(i + " ");
        }

        return;
    }
}
