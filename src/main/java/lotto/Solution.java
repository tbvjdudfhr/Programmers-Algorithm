package lotto;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer;
        HashSet<Integer> winNumsSet = new HashSet<>(Arrays.asList(Arrays.stream(win_nums).boxed().toArray(Integer[]::new)));
        int cnt = (int) Arrays.stream(lottos).filter(a -> a == 0).count();
        int lottoCnt = 0;
        for (int lotto : Arrays.stream(lottos).filter(a -> a != 0).toArray()) {
            if (winNumsSet.contains(lotto)) {
                lottoCnt++;
            }
        }
        getRank(lottoCnt);
        answer = new int[]{getRank(cnt + lottoCnt), getRank(lottoCnt)};
        return answer;
    }

    private int getRank(int x) {
        switch (x) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}
