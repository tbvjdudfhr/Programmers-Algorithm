package inflearn._6_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] ints = new int[m];
        for (int i = 0; i < m; i++) {
            ints[i] = kb.nextInt();
        }
        System.out.print(solution(n, m, ints));
        return;
    }

    private static String solution(int n, int m, int[] ints) {
        String answer = "";
        int[] cash = new int[n];

        for(int x : ints) {
            int pos = -1;
            for(int i = 0; i< n; i++) if(x==cash[i]) pos = i;
            if(pos == -1){
                for (int i = n -1; i >= 1; i--) {
                    cash[i] = cash[i-1];
                }
            }
            else {
                for (int i = pos; i >= 1; i--) {
                    cash[i] = cash[i-1];
                }
            }
            cash[0] = x;
        }

        for (int x : cash) {
            answer += x + " ";
        }
        return answer;
    }
}
