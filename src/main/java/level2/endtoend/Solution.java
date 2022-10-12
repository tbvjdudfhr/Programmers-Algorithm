package level2.endtoend;

import java.util.HashSet;

public class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        HashSet<String> strings = new HashSet<>();
        strings.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            String word = words[i -1];
            String nextWord = words[i];
            if(word.charAt(word.length() -1) != nextWord.charAt(0) || !strings.add(nextWord)) {
                return new int[]{i % n + 1, i / n + 1};
            }

        }
        return answer;
    }
}
