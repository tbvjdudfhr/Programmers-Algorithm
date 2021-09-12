package inflearn._2_1;

import java.util.Scanner;

public class Solution {
    public String solution(int[] ints) {
        String answer = "";
        for (int i = 0; i < ints.length; i++) {
            if(i == 0) answer += ints[i];
            else {
                if(ints[i-1] < ints[i]) answer += " " + ints[i];
            }
        }
        return answer;
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
