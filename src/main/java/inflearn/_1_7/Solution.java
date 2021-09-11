package inflearn._1_7;

public class Solution {
    public String solution(String str) {
        String answer = "NO";
        String rStr = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(rStr)) answer = "YES";

        return answer;
    }
}
