package bookpractice.chapter5.모음사전;

public class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] weight = {781, 156, 31, 6, 1};

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            answer += "AEIOU".indexOf(c) * weight[i] + 1;
        }

        return answer;
    }
}