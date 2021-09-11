package inflearn._1_9;

public class Solution {
    public int solution(String str) {
        int answer = 0;
        String tmp = "";
        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) tmp += x;
        }

        answer = Integer.parseInt(tmp);
        return answer;
    }
}
