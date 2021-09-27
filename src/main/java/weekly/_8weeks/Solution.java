package weekly._8weeks;

import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0, row = 0, column = 0;
        for (int[] arr : sizes) {
            Arrays.sort(arr);
            row = Math.max(row, arr[0]);
            column = Math.max(column, arr[1]);
        }
        answer = row * column;
        return answer;
    }
}