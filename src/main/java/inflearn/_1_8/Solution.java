package inflearn._1_8;

public class Solution {
    public String solution(String str) {
        String answer = "NO";
        str = str.replaceAll("[^a-zA-Z]", "");
        String rStr = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(rStr)) answer = "YES";

        return answer;
    }
}
