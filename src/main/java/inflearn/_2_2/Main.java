package inflearn._2_2;


import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    int cnt = 1;
    int max = 0;
    public String solution(int[] ints) {
        max = ints[0];
        IntStream.range(1, ints.length)
                .forEach(index -> getCount(ints, index));

        return String.valueOf(cnt);
    }

    private void getCount(int[] ints, int i) {
        if (max < ints[i]) {
            cnt++;
            max = ints[i];
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Main t = new Main();
        int i = kb.nextInt();
        int[] ints = new int[i];
        for (int j = 0; j < ints.length; j++) {
            ints[j] = kb.nextInt();
        }
        System.out.println(t.solution(ints));
        return;
    }
}
