package inflearn._9_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int height = kb.nextInt();
            int weight = kb.nextInt();
            players.add(new Player(height, weight));
        }

        System.out.println(Solution(players));

        return;
    }

    private static int Solution(ArrayList<Player> players) {
        Collections.sort(players);
        int cnt = 0, maxWeight = 0;
        for (Player player : players) {
            if (maxWeight < player.weight) {
                cnt++;
                maxWeight = player.weight;
            }
        }
        return cnt;
    }

    private static class Player implements Comparable<Player> {
        int height;
        int weight;

        public Player(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Player o) {
            if (this.height == o.height) return o.weight - this.weight;
            return o.height - this.height;
        }
    }
}
