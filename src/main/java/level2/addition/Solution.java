package level2.addition;

public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += absolutes[i] * getSign(signs[i]);
        }
        return answer;
    }

    private int getSign(boolean sign) {
        if (sign) {
            return 1;
        }
        return -1;
    }
}
