package level2.babbling;

public class Solution {

    private static final String AYA = "aya";
    private static final String YE = "ye";
    private static final String WOO = "woo";
    private static final String MA = "ma";

    public int solution(String[] babbling) {
        int answer = 0;

        for (String str : babbling) {
            if (str.contains(AYA + AYA) || str.contains(YE + YE) || str.contains(WOO + WOO) || str.contains(MA + MA)) {
                continue;
            }

            String replaceStr = str.replaceAll(AYA, " ")
                    .replaceAll(YE, " ")
                    .replaceAll(WOO, " ")
                    .replaceAll(MA, " ");

            replaceStr = replaceStr.replaceAll(" ", "");
            if (replaceStr.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
