package leetcode._22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    StringBuilder stringBuilder;
    List<String> answer;

    public List<String> generateParenthesis(int n) {
        stringBuilder = new StringBuilder();
        answer = new ArrayList<>();
        dfs(0, 0, 0, n);
        return answer;
    }

    public void dfs(int depth, int openCnt, int closeCnt, int n) {
        if (depth == 2 * n) {
            answer.add(stringBuilder.toString());
            return;
        }
        if (openCnt < n) {
            stringBuilder.append('(');
            dfs(depth + 1, openCnt + 1, closeCnt, n);
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        if (closeCnt < openCnt) {
            stringBuilder.append(')');
            dfs(depth + 1, openCnt, closeCnt + 1, n);
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
    }
}
