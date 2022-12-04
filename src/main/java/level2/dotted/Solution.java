package level2.dotted;

public class Solution {
    public long solution(int k, int d) {
        long answer = 0;

        for (int i = 0; i <= d; i += k) {
            int yMaxDistance = yPossibleDistance(i, d);
            answer += yPossibleCount(yMaxDistance, k);
        }
        return answer;
    }

    private static int yPossibleDistance(int x, int d) {
        long xx = (long) Math.pow(x, 2);
        long dd = (long) Math.pow(d, 2);

        int result = (int) (Math.sqrt(dd - xx));
        return result;
    }

    private static int yPossibleCount(int possible, int k) {
        int y = (possible / k);
        return y + 1;
    }
}
