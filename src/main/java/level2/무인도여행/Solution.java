package level2.무인도여행;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    int[][] map;
    List<Integer> answer = new LinkedList<>();

    public int[] solution(String[] maps) {
        map = new int[maps.length][maps[0].length()];
        for (int i = 0; i < maps.length; i++) {
            char[] mapCharArr = maps[i].toCharArray();

            for (int j = 0; j < mapCharArr.length; j++) {
                char c = mapCharArr[j];

                if (c == 'X' || c == 'x') {
                    map[i][j] = -1;
                } else {
                    map[i][j] = c - '0';
                }
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                int islandSum = dfs(i, j);
                if (islandSum > 0) {
                    answer.add(islandSum);
                }
            }
        }

        if (answer.size() == 0) {
            return new int[]{-1};
        }

        Collections.sort(answer);

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int dfs(int i, int j) {
        if (i < 0 || j < 0 || i >= map.length || j >= map[0].length) {
            return 0;
        }
        if (map[i][j] == -1) {
            return 0;
        }

        int tmp = map[i][j];
        map[i][j] = -1;
        return tmp + dfs(i - 1, j) + dfs(i + 1, j) + dfs(i, j - 1) + dfs(i, j + 1);
    }
}
