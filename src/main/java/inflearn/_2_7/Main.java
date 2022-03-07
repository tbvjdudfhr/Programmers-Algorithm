package inflearn._2_7;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static int tmp = 0;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] ints = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = kb.nextInt();
        }

        System.out.print(solution(ints));

        return;
    }

    public static int solution(int[] ints) {
        return IntStream.range(0, ints.length)
                .map(index -> getScore(ints, index))
                .sum();
    }

    private static int getScore(int[] ints, int index) {
        if (ints[index] == 1) {
            return tmp += 1;
        }

        return tmp = 0;
    }
}
