package level2.크기가작은부분문자열;

public class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        for (int i = 0; i <= t.length() - length; i++) {
            if (isSmallThan(t.substring(i, i + length), p)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isSmallThan(String subStr, String p) {
        return Long.parseLong(subStr) <= Long.parseLong(p);
    }
}
