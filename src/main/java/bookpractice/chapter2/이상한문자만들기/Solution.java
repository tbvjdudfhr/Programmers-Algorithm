package bookpractice.chapter2.이상한문자만들기;

public class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");

        for (int j = 0; j < words.length; j++) {
            StringBuilder convertedWord = new StringBuilder();
            String word = words[j];

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                if (i % 2 == 0) {
                    convertedWord.append(Character.toUpperCase(c));
                } else {
                    convertedWord.append(Character.toLowerCase(c));
                }
            }

            result.append(convertedWord);

            if (j < words.length - 1) {
                result.append(" ");
            }
        }

        int trailingSpaces = s.length() - s.stripTrailing().length();
        for (int k = 0; k < trailingSpaces; k++) {
            result.append(" ");
        }

        return result.toString();
    }
}
