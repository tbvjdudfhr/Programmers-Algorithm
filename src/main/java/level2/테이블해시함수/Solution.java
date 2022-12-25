package level2.테이블해시함수;

import java.util.Arrays;

public class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        Arrays.sort(data, (o1, o2) -> {
            if (o1[col - 1] == o2[col - 1]) {
                return Integer.compare(o2[0], o1[0]);
            }
            return Integer.compare(o1[col - 1], o2[col - 1]);
        });
        int xor = 0;
        for (int i = row_begin; i <= row_end; i++) {
            int[] row = data[i - 1];
            int sum = 0;
            for (int n : row) {
                sum += n % i;
            }
            xor ^= sum;
        }
        return xor;
    }
}
