package pccp._2.체육대회;

public class Solution {
    int answer = 0;
    static boolean[] isVisit;
    public int solution(int[][] ability) {
        isVisit = new boolean[ability.length];
        dfs(0, 0, ability);
        return answer;
    }

    private void dfs(int depth, int sum, int[][] ability) {
        if (depth == ability[0].length) {
            answer = Math.max(answer, sum);
            return;
        }
        for (int i = 0; i < ability.length; i++) {
            if (!isVisit[i]) {
                isVisit[i] = true;
                dfs(depth + 1, sum + ability[i][depth], ability);
                isVisit[i] = false;
            }
        }
    }
}