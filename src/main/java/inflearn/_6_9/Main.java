package inflearn._6_9;

import java.util.Arrays;
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
        System.out.print(solution(m, ints));
        return;
    }

    public static int solution(int m, int[] ints) {
        int answer = 0;
        int sum = Arrays.stream(ints).sum();
        int lt = ints[ints.length - 1];
        int rt = sum;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            int tmp = 0, cnt = 1;
            for (int i = 0; i < ints.length; i++) {
                if (tmp + ints[i] <= mid) {
                    tmp += ints[i];
                } else {
                    tmp = 0;
                    tmp += ints[i];
                    cnt++;
                }
            }
            if (cnt <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }
}
