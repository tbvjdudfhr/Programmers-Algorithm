package inflearn._1_10;

public class Solution {
    public int[] solution(String str, char s) {
        char[] charArray = str.toCharArray();
        int[] answer = new int[charArray.length];
        int d = 100;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == s) d = 0;
            else d++;
            answer[i] = d;
        }

        d = 100;
        for (int i = charArray.length -1; i >= 0; i--) {
            if(charArray[i] == s) d = 0;
            else d++;
            answer[i]  = Math.min(answer[i], d);
        }
        return answer;
    }
}
