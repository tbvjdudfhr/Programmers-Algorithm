package level2.splitstring;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        char init = s.charAt(0);
        int count = 0;
        for (char c : s.toCharArray()) {
            if (count == 0) {
                init = c;
            }
            if (init == c) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                answer++;
            }
        }
        if(count > 0) {
            answer++;
        }
        return answer ;
    }
}
