package inflearn._1_6;

public class Solution {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        return answer;
    }
}