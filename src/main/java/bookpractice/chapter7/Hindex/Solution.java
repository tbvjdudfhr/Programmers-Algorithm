package bookpractice.chapter7.Hindex;

import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int hIndex = 0;
        int length = citations.length;

        for (int i = 0; i < length; i++) {
            int smallerValue = Math.min(citations[i], length - i);
            hIndex = Math.max(hIndex, smallerValue);
        }

        return hIndex;
    }
}