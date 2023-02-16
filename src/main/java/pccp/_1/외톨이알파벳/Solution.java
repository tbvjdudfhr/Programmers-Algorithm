package pccp._1.외톨이알파벳;

import java.util.Arrays;

public class Solution {
    public String solution(String input_string) {
        String answer = "";
        for (int i = 0; i < input_string.length() - 1; i++) {
            char c = input_string.charAt(i);
            char nextC = input_string.charAt(i + 1);
            if (c == nextC) {
                continue;
            }

            if (input_string.substring(i + 1).contains(Character.toString(c)) && !answer.contains(Character.toString(c))) {
                answer += c;
            }
        }

        if (answer.isEmpty()) {
            return "N";
        }
        char[] charArray = answer.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
