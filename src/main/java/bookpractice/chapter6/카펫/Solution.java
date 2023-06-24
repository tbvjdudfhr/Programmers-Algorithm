package bookpractice.chapter6.카펫;

public class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int total = brown + yellow;

        for (int height = 3; height <= total / 3; height++) {
            if (total % height == 0) {
                int width = total / height;
                int brownCount = (width + height) * 2 - 4;
                int yellowCount = total - brownCount;

                if (brownCount == brown && yellowCount == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }

        return answer;
    }
}