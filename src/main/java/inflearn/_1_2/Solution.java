package inflearn._1_2;

import java.util.Locale;

class Solution {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            answer += (Character.isLowerCase(x)) ?  Character.toUpperCase(x) : Character.toLowerCase(x);
        }

        return answer;
    }
}