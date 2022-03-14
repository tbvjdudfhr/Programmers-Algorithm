package inflearn._3_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }

        for (Integer x : solution(arr, arr2)) {
            System.out.print(x + " ");
        }

        return;
    }

    public static ArrayList<Integer> solution(int[] arr, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int pi = 0, pj = 0;
        while (pi < arr.length && pj < arr2.length) {
            if (arr[pi] > arr2[pj]) {
                pj++;
            } else if (arr[pi] < arr2[pj]) {
                pi++;
            } else {
                list.add(arr[pi]);
                pi++;
                pj++;
            }
        }

        return list;
    }
}
