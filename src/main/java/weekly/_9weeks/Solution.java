package weekly._9weeks;

import java.util.Arrays;

class Solution {
    static int[][] graph;
    static int[] ch;
    static int count = 0;

    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        int len = n + 1;

        graph = new int[len][len];
        ch = new int[len];

        for (int[] wire : wires) {
            graph[wire[0]][wire[1]] = 1;
            graph[wire[1]][wire[0]] = 1;
        }

        for (int[] wire : wires) {
            graph[wire[0]][wire[1]] = 0;
            graph[wire[1]][wire[0]] = 0;

            dfs(1);

            graph[wire[0]][wire[1]] = 1;
            graph[wire[1]][wire[0]] = 1;

            answer = Math.min(answer, Math.abs(n - 2 * count));

            Arrays.fill(ch, 0);
            count = 0;
        }

        return answer;
    }

    private void dfs(int v) {
        count++;
        ch[v] = 1;
        for (int i = 0; i < graph.length; i++) {
            if (graph[v][i] == 1 && ch[i] == 0) {
                dfs(i);
            }
        }
    }
}