package bookpractice.chapter2.문자열압축;

public class Solution {
    public int solution(String s) {
        int answer = s.length();

        for (int unit = 1; unit <= s.length() / 2; unit++) {
            StringBuilder compressed = new StringBuilder();
            String prev = s.substring(0, unit);
            int count = 1;

            for (int i = unit; i < s.length(); i += unit) {
                String curr = (i + unit <= s.length()) ? s.substring(i, i + unit) : s.substring(i);
                if (prev.equals(curr)) {
                    count++;
                } else {

                    if (count > 1) {
                        compressed.append(count);
                    }
                    compressed.append(prev);
                    prev = curr;
                    count = 1;
                }
            }

            if (count > 1) {
                compressed.append(count);
            }
            compressed.append(prev);

            answer = Math.min(answer, compressed.length());
        }

        return answer;
    }
}