package inflearn._6_10;

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
        Arrays.sort(ints);
        int lt = 1;
        int rt = ints[ints.length - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            int cnt = 1, endPoint = ints[0];
            for (int x : ints) {
                if (x - endPoint >= mid) {
                    cnt++;
                    endPoint = x;
                }
            }
            if (cnt >= m) {
                answer = Math.max(mid, answer);
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return answer;
    }
}
