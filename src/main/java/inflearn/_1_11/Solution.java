package inflearn._1_11;

public class Solution {
    public String solution(String str) {
        String answer = "";
        str = str + " ";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            char nextC = str.charAt(i + 1);
            if (c == nextC) cnt++;
            else {
                answer += c;
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }
}
