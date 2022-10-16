package level2.remove;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        int length = s.length();
        boolean flag = true;

        while (flag) {
            for (int i = 0; i < length - 1; i++) {
                char c = s.charAt(i);
                char nextC = s.charAt(i + 1);
                flag = false;
                if (c == nextC) {
                    String pair = s.substring(i, i + 2);
                    s = s.replaceAll(pair, "");
                    length = s.length();
                    flag = true;
                    break;
                }
            }

            if(s.isEmpty()) {
                return 1;
            }
        }

        return answer;
    }
}
