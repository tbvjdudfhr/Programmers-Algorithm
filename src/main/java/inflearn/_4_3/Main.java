package inflearn._4_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = kb.nextInt();
        }

        for (int x : solution(n, m, ints)) {
            System.out.print(x + " ");
        }
        return;
    }

    public static ArrayList<Integer> solution(int n, int m, int[] ints) {
        ArrayList<Integer> list = new ArrayList<>();
        int lt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m - 1; i++) {
            map.put(ints[i], map.getOrDefault(ints[i], 0) + 1);
        }

        for (int rt = m - 1; rt < n; rt++) {
            map.put(ints[rt], map.getOrDefault(ints[rt], 0) + 1);
            list.add(map.size());
            map.put(ints[lt], map.get(ints[lt]) - 1);
            if (map.get(ints[lt]) == 0) map.remove(ints[lt]);
            lt++;
        }

        return list;
    }
}

