package bookpractice.chapter6.불량사용자;

import java.util.*;

public class Solution {
    private String[] user_id;

    public int solution(String[] user_id, String[] banned_id) {
        this.user_id = user_id;

        List<List<String>> matches = new ArrayList<>();
        for (String banned : banned_id) {
            List<String> match = new ArrayList<>();
            for (String user : user_id) {
                if (isMatch(user, banned))
                    match.add(user);
            }
            matches.add(match);
        }

        Set<String> selected = new HashSet<>();
        boolean[] visited = new boolean[user_id.length];
        return countValidMatches(matches, visited, selected, 0);
    }

    private boolean isMatch(String user, String banned) {
        if (user.length() != banned.length())
            return false;

        for (int i = 0; i < user.length(); i++) {
            if (banned.charAt(i) == '*')
                continue;
            if (banned.charAt(i) != user.charAt(i))
                return false;
        }

        return true;
    }

    private int countValidMatches(List<List<String>> matches, boolean[] visited, Set<String> selected, int index) {
        if (index == matches.size()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < visited.length; i++) {
                if (visited[i]) {
                    sb.append(i).append(",");
                }
            }
            String key = sb.toString();
            if (!selected.contains(key)) {
                selected.add(key);
                return 1;
            }
            return 0;
        }

        List<String> match = matches.get(index);
        int count = 0;
        for (int i = 0; i < match.size(); i++) {
            String user = match.get(i);
            int userIdIndex = getUserIndex(user);
            if (!visited[userIdIndex]) {
                visited[userIdIndex] = true;
                count += countValidMatches(matches, visited, selected, index + 1);
                visited[userIdIndex] = false;
            }
        }

        return count;
    }

    private int getUserIndex(String user) {
        for (int i = 0; i < user_id.length; i++) {
            if (user_id[i].equals(user))
                return i;
        }
        return -1;
    }
}