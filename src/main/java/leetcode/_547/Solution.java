package leetcode._547;

public class Solution {
    public int findCircleNum(int[][] isConnected) {
        int length = isConnected.length;
        int answer = 0;
        boolean[] visited = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (visited[i] == false) {
                dfs(isConnected, visited, i);
                answer++;
            }
        }

        return answer;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int i) {
        for (int j = 0; j < isConnected.length; j++) {
            if (visited[j] == false && isConnected[i][j] == 1) {
                visited[j] = true;
                dfs(isConnected, visited, j);
            }
        }
    }
}
