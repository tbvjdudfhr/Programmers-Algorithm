package level2.대충만든자판;

public class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int length = targets.length;
        int[] answer = new int [length];

        for (int i = 0; i < length; i++) {
            String target = targets[i];
            int indexSum = 0;
            for (int j = 0; j < target.length(); j++) {
                String str = target.charAt(j) + "";
                int min = 100;
                for (String key: keymap) {
                    int index = key.indexOf(str) + 1;
                    if (index != 0)
                        min = Math.min(min, index);
                }
                if (min == 100) {
                    indexSum = -1;
                    break;
                }
                indexSum += min;
            }
            answer[i] = indexSum;
        }
        return answer;
    }
}
