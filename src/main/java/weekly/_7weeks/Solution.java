package weekly._7weeks;

import java.util.*;

class Solution {
    public int[] solution(int[] enter, int[] leave) {
        int len = enter.length;
        int[] answer = new int[len];
        HashSet<Integer> integerSet = new HashSet<>();
        int lt = 0, rt = 0;
        while (lt != len && rt != len) {
            integerSet.add(enter[lt]);
            if (integerSet.size() > 1) {
                for (int x : integerSet) {
                    answer[x - 1]++;
                }
                answer[enter[lt] - 1] += integerSet.size() - 2;
            }

            while (true) {
                if (rt < len && integerSet.contains(leave[rt])) {
                    integerSet.remove(leave[rt]);
                    rt++;
                } else break;
            }
            lt++;
        }

        return answer;
    }
}