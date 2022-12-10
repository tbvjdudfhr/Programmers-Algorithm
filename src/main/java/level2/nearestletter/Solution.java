package level2.nearestletter;

import java.util.HashMap;

public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            answer[i] = -1;
            if (hashMap.containsKey(c)) {
                answer[i] = i - hashMap.get(c);
            }
            hashMap.put(c, i);
        }
        return answer;
    }
}
