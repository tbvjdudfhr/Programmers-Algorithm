package bookpractice.chapter2.이진변환반복하기;

public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int convertCount = 0;
        int removedZeros = 0;

        while (!s.equals("1")) {
            int len = s.length();
            s = s.replace("0", "");
            removedZeros += len - s.length();
            s = Integer.toBinaryString(s.length());
            convertCount++;
        }

        answer[0] = convertCount;
        answer[1] = removedZeros;

        return answer;
    }
}