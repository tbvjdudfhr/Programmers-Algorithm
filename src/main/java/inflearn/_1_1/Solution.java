package inflearn._1_1;

import java.util.Locale;

class Solution {
    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase(Locale.ROOT);
        t = Character.toUpperCase(t);

        for (char c : str.toCharArray()) {
            if(c == t) answer++;
        }

        return answer;
    }
}