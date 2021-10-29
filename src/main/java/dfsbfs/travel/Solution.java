package dfsbfs.travel;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public static final String START_AIRPORT = "ICN";
    public static final String DELIMITER = " ";
    static boolean[] visited;
    static ArrayList<String> result;

    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        result = new ArrayList<>();
        dfs(START_AIRPORT, START_AIRPORT, 0, tickets);

        Collections.sort(result);

        return result.get(0).split(DELIMITER);
    }

    static void dfs(String start, String route, int cnt, String[][] tickets) {
        if (cnt == tickets.length) {
            result.add(route);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && tickets[i][0].equals(start)) {
                visited[i] = true;
                dfs(tickets[i][1], route + DELIMITER + tickets[i][1], cnt + 1, tickets);
                visited[i] = false;
            }
        }
    }
}
