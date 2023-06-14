package bookpractice.chapter2.이진변환반복하기;

public class Solution {
    public int[] solution(String s) {
        int transformCount = 0;
        int zeroCount = 0;

        while (!s.equals("1")) {
            int originalLength = s.length();
            s = binaryConversion(s);
            int newLength = s.length();

            zeroCount += (originalLength - newLength);
            transformCount++;
        }

        return new int[]{transformCount, zeroCount};
    }


    private String binaryConversion(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != '0') {
                sb.append(c);
            }
        }

        int length = sb.length();
        sb.setLength(0);

        while (length > 0) {
            sb.append(length % 2);
            length /= 2;
        }

        return sb.reverse().toString();
    }
}