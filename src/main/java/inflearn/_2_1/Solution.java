package inflearn._2_1;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public String solution(int[] ints) {
        return IntStream.range(0, ints.length)
                .filter(index -> index == 0 || ints[index] > ints[index - 1])
                .mapToObj(index -> Integer.toString(ints[index]))
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Solution sol = new Solution();
        int i = kb.nextInt();
        int[] ints = new int[i];
        for (int j = 0; j < ints.length; j++) {
            ints[j] = kb.nextInt();
        }
        System.out.println(sol.solution(ints));
        return;
    }
}
