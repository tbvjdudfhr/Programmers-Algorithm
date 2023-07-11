package bookpractice.chapter9.A로B만들기;

public class Solution {
    public int solution(String before, String after) {
        int length = before.length();

        if (length != after.length()) {
            return 0;
        }

        int[] charCount = new int[26];

        for (int i = 0; i < length; i++) {
            charCount[before.charAt(i) - 'a']++;
        }
        for (int i = 0; i < length; i++) {
            char c = after.charAt(i);
            if (charCount[c - 'a'] == 0) {
                return 0;
            }

            charCount[c - 'a']--;
        }

        return 1;
    }
}
