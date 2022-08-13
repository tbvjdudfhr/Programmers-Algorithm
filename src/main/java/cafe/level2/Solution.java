package cafe.level2;

public class Solution {
    public int solution(int param) {
        int answer = 0;
        for (int i = 3; i < param; i++) {
            String str = i + "";
            for (char s : str.toCharArray()) {
                if(s == '3' || s == '6' || s == '9') {
                    answer++;
                }
            }
        }
        return answer;
    }
}
