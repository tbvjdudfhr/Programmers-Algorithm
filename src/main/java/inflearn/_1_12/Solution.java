package inflearn._1_12;

public class Solution {
    public String solution(int x, String str) {
        String answer = "";
        for(int i = 0; i < str.length(); i+=7) {
            String subStr = str.substring(i, i+7);
            int tmp = Integer.parseInt(subStr.replaceAll("#", "1").replaceAll("\\*", "0"), 2);
            answer += (char) tmp;
        }
        return answer;
    }
}
