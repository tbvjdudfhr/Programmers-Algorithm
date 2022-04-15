package inflearn._8_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n, longTime = 0, maxScore = Integer.MIN_VALUE;
    static ArrayList<Quiz> quizArrayList = new ArrayList<>();

    public static void DFS(int L, int sumScore, int sumTime, ArrayList<Quiz> list) {
        if (sumTime > longTime) return;
        if (L == n) {
            maxScore = Math.max(maxScore, sumScore);
        } else {
            DFS(L + 1, sumScore + list.get(L).score, sumTime + list.get(L).time, list);
            DFS(L + 1, sumScore, sumTime, list);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        longTime = kb.nextInt();
        for (int i = 0; i < n; i++) {
            quizArrayList.add(new Quiz(kb.nextInt(), kb.nextInt()));
        }
        DFS(0, 0, 0, quizArrayList);

        System.out.println(maxScore);

        return;
    }

    public static class Quiz {
        int score;
        int time;

        Quiz(int score, int time) {
            this.score = score;
            this.time = time;
        }

        static Quiz of(int score, int time) {
            return new Quiz(score, time);
        }
    }
}
