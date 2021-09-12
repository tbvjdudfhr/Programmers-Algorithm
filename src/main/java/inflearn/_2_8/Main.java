package inflearn._2_8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Integer> list = new ArrayList();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            ints[i] = x;
            list.add(x);
        }
        Collections.sort(list, Collections.reverseOrder());
        for (int i : ints) {
            System.out.print(list.indexOf(i) + 1 + " ");
        }

        return;
    }
}
