package inflearn._10_6;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int number, time;
    static int[] dp;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        number = kb.nextInt();
        time = kb.nextInt();
        ArrayList<Problem> problems = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            int ps = kb.nextInt();
            int pt = kb.nextInt();
            problems.add(Problem.of(ps, pt));
        }

        solution(problems);

        System.out.println(dp[time]);
    }

    public static void solution(ArrayList<Problem> problems) {
        dp = new int[time + 1];

        for (Problem problem : problems) {
            for (int j = time; j >= problem.time; j--) {
                dp[j] = Math.max(dp[j], dp[j - problem.time] + problem.score);
            }
        }
    }

    public static class Problem {
        int score;
        int time;

        private Problem(int score, int time) {
            this.score = score;
            this.time = time;
        }

        public static Problem of(int score, int time) {
            return new Problem(score, time);
        }
    }
}
