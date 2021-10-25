package weekly._12weeks;

class Solution {
    int[][] dungeons;
    boolean[] visit;
    int answer = 0;

    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons.clone();
        visit = new boolean[dungeons.length];
        dfs(k, 0);
        return answer;
    }

    private void dfs(int tired, int cnt) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && dungeons[i][0] <= tired) {
                visit[i] = true;
                dfs(tired - dungeons[i][1], cnt + 1);
                visit[i] = false;
            }
        }
        answer = Math.max(answer, cnt);
    }
}