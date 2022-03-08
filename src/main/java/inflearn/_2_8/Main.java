package inflearn._2_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        List list = new ArrayList();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            ints[i] = x;
            list.add(x);
        }

        for (int i : ints) {
            System.out.print(reverseOrderList(list).indexOf(i) + 1 + " ");
        }

        return;
    }

    public static List reverseOrderList(List list) {
        Collections.sort(list, Collections.reverseOrder());

        return list;
    }
}
