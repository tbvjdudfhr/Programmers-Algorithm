package level2.numberblock;

public class Solution {
    public int[] solution(long begin, long end) {
        int first = (int) begin;
        int last = (int) end;
        int[] answer = new int[last - first + 1];

        for (int now = first; now < last + 1; now++) {
            answer[now - first] = 1;

            for (int div = 2; div <= Math.floor(Math.sqrt(now)); div++)
                if (now % div == 0 && now / div <= 10000000) {
                    answer[now - first] = now / div;
                    break;
                }
        }

        if (first == 1) {
            answer[0] = 0;
        }

        return answer;
    }
}
