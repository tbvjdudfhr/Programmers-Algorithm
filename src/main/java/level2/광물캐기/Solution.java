package level2.광물캐기;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Predicate;

public class Solution {
    public int solution(int[] picks, String[] minerals) {
        Queue<String> mineralOrder = new LinkedList<>();
        for (String mineral : minerals) {
            mineralOrder.offer(mineral);
        }

        Queue<Info> mining = new LinkedList<>();
        mining.offer(new Info(picks, mineralOrder, 0));

        return bfs(mining);
    }

    private int bfs(Queue<Info> mining) {
        int min = Integer.MAX_VALUE;

        while (!mining.isEmpty()) {
            Info cn = mining.poll();
            boolean allUsed = isAllPickUsed(cn);

            if (cn.minerals.isEmpty() || allUsed) {
                min = Math.min(min, cn.fatigue);
                continue;
            }

            for (int i = 0; i < 3; i++) {
                if (cn.picks[i] == 0) continue;

                int[] copiedPick = copyPick(cn.picks);
                Queue<String> copiedMineral = copyMinerals(cn.minerals);

                int cnt = 0;
                int sumFatigue = 0;
                while (!copiedMineral.isEmpty() && cnt++ < 5) {
                    sumFatigue += Mining.calFatigue(i, copiedMineral.poll());
                }

                copiedPick[i]--;

                mining.add(new Info(copiedPick, copiedMineral, cn.fatigue + sumFatigue));
            }
        }

        return min;
    }

    private boolean isAllPickUsed(Info cn) {
        for (int i = 0; i < 3; i++) {
            if (cn.picks[i] != 0) {
                return false;
            }
        }
        return true;
    }

    private int[] copyPick(int[] picks) {
        return Arrays.copyOf(picks, 3);
    }

    private Queue<String> copyMinerals(Queue<String> minerals) {
        return new LinkedList<>(minerals);
    }

    private class Info {
        int[] picks;
        Queue<String> minerals;
        int fatigue;

        public Info(int[] picks, Queue<String> minerals, int fatigue) {
            this.picks = picks;
            this.minerals = minerals;
            this.fatigue = fatigue;
        }
    }

    private enum Mining {
        DIAMOND(0, x -> x.equals("diamond")),
        IRON(1, x -> x.equals("iron")),
        STONE(2, x -> x.equals("stone"));

        private int pick;
        private Predicate<String> predicate;

        Mining(int pick, Predicate<String> predicate) {
            this.pick = pick;
            this.predicate = predicate;
        }

        private boolean test(String mine) {
            return this.predicate.test(mine);
        }

        private static Mining adequatePick(String mine) {
            return Arrays.stream(Mining.values())
                    .filter(e -> e.test(mine))
                    .findAny()
                    .orElseThrow();
        }

        private static int calFatigue(int pi, String mine) {
            Mining adequate = adequatePick(mine);

            if (pi <= adequate.pick) {
                return 1;
            }
            return (int) Math.pow(5, (pi - adequate.pick));
        }
    }
}

