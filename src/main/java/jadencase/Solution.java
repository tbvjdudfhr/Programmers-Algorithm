package jadencase;

public class Solution {
    public String solution(String s) {
        String answer = "";
        boolean flag = true;
        char[] charArray = s.toLowerCase().toCharArray();
        for (char c : charArray) {
            answer += getChar(flag, c);
            flag = isBlank(c);
        }

        return answer;
    }

    private char getChar(boolean flag, char c) {
        if (flag) {
            return Character.toUpperCase(c);
        }

        return c;
    }

    private boolean isBlank(char c) {
        if (c == ' ') {
            return true;
        }

        return false;
    }
}
