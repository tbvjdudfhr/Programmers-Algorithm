package inflearn._3_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] input2 = new int[m];
        for (int i = 0; i < m; i++) {
            input2[i] = kb.nextInt();
        }
        List<Integer> list = combineTwoArrays(input, input2);
        for (int i : list) {
            System.out.print(i + " ");
        }

        return;
    }

    public static List<Integer> combineTwoArrays(int[] input, int[] input2) {
        List<Integer> list = arraysToList(input);
        list.addAll(arraysToList(input2));
        Collections.sort(list);

        return list;
    }

    private static List<Integer> arraysToList(int[] ints) {
        return Arrays.stream(ints).boxed().collect(Collectors.toList());
    }
}
