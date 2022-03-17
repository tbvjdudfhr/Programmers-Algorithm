package inflearn._3_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.print(solution(n));

        return;
    }

    public static int solution(int n) {
        int i = 2, cnt = 0;
        int tmp = n - 1;
        while (tmp > 0) {
            tmp -= i;
            if(tmp % i == 0) cnt++;
            i++;
        }

        return cnt;
    }
}
