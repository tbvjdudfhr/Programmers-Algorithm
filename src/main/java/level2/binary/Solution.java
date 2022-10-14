package level2.binary;

public class Solution {
    public int[] solution(String s) {
        int count = 0;
        int sumZeroCount = 0;
        while(s.length() > 1) {
            count++;
            String replaceAll = s.replaceAll("0", "");
            int zeroCount = s.length() - replaceAll.length();
            sumZeroCount += zeroCount;
            s = Integer.toBinaryString(replaceAll.length());
        }

        return new int[] {count, sumZeroCount};
    }
}
