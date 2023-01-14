package dfsbfs.바이러스;

public class Solution {
    static boolean[][] graph;
    static boolean[] visited;
    static int answer = -1;
    static int length;

    public int solution(int[][] pair) {
        length = pair.length;
        graph = new boolean[length + 1][length + 1];
        visited = new boolean[length + 1];

        for (int i = 0; i < pair.length; i++) {
            for (int j = 0; j < pair[i].length; j++) {
                graph[i][j] = graph[j][i] = true;
            }
        }

        dfs(1);
        return answer;
    }

    private void dfs(int idx) {
        visited[idx] = true;
        answer++;
        for (int i = 1; i <= length; i++) {
            if (visited[i] == false && graph[idx][i]) {
                dfs(i);
            }
        }
    }
}
