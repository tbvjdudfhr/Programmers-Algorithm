package dev.test1;

public class Solution {
    public int solution(String[] drum) {
        int answer = -1;
        int length = drum.length;
        String[][] strings = new String[length][length];

        for (int i = 0; i < drum.length; i++) {
            String string = drum[i];
            for (int j = 0; j < string.length(); j++) {
                char c = string.charAt(j);
                strings[i][j] = Character.toString(c);
            }
        }


        return answer;
    }
}
