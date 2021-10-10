package inflearn._10_4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static int[] dp;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        dp = new int[count];
        ArrayList<Brick> bricks = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int area = kb.nextInt();
            int height = kb.nextInt();
            int weight = kb.nextInt();
            bricks.add(new Brick(area, height, weight));
        }

        System.out.println(solution(bricks));
    }

    private static int solution(ArrayList<Brick> bricks) {
        int answer;
        Collections.sort(bricks);
        dp[0] = bricks.get(0).height;
        answer = dp[0];

        for (int i = 1; i < bricks.size(); i++) {
            int maxHeight = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (bricks.get(j).weight > bricks.get(i).weight && dp[j] > maxHeight) {
                    maxHeight = dp[j];
                }
            }
            dp[i] = maxHeight + bricks.get(i).height;
            answer = Math.max(answer, dp[i]);
        }
        return answer;
    }

    private static class Brick implements Comparable<Brick> {
        private final int area;
        private final int height;
        private final int weight;

        public Brick(int area, int height, int weight) {
            this.area = area;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Brick o) {
            return o.area - this.area;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Brick brick = (Brick) o;
            return area == brick.area && height == brick.height && weight == brick.weight;
        }

        @Override
        public int hashCode() {
            return Objects.hash(area, height, weight);
        }
    }
}
