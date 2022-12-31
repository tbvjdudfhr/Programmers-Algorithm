package level2.playingalone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int solution(int[] cards) {
        int n = cards.length;
        boolean[] visited = new boolean[n];
        List<Integer> groups = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int now = i;
            int cnt = 0;
            while (!visited[now]) {
                cnt++;
                visited[now] = true;
                now = cards[now] - 1;
            }
            groups.add(cnt);
        }
        Collections.sort(groups, Comparator.reverseOrder());
        return (groups.size() == 1) ? 0 : groups.get(0) * groups.get(1);
    }
}
