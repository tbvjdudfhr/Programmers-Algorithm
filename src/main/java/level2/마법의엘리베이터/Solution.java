package level2.마법의엘리베이터;

public class Solution {
    public int solution(int storey) {
        var answer = 0;
        String number = "0" + storey;
        int add = 0;
        for (int i = number.length() - 1; i >= 1; i--) {
            int c = Character.getNumericValue(number.charAt(i)) + add;

            if (c == 5) {
                if (number.charAt(i - 1) < 5) {
                    answer += c;
                    add = 0;
                } else {
                    answer += 10 - c;
                    add = 1;
                }
            } else if (c < 5) {
                answer += c;
                add = 0;
            } else {
                answer += 10 - c;
                add = 1;
            }
        }
        return answer;
    }
}
