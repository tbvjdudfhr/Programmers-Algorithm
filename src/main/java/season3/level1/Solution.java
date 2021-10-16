package season3.level1;

import java.util.Arrays;

public class Solution {
    public static final int SUM_0_9 = 45;

    public int solution(int[] numbers) {
        return SUM_0_9 - Arrays.stream(numbers).sum();
    }
}
