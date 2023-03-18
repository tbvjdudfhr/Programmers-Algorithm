package level2.당구연습;

public class Solution {
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int nearM = startX;
        int nearN = startY;

        if (m - startX < startX) {
            nearM = m - startX;
        }
        if (n - startY < startY) {
            nearN = n - startY;
        }


        int length = balls.length;
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            int width = (startX + balls[i][0]) * (startX + balls[i][0]);
            int height = (startY + balls[i][1]) * (startY + balls[i][1]);

            int width_m = ((m + m) - (startX + balls[i][0])) * ((m + m) - (startX + balls[i][0]));
            int height_n = ((n + n) - (startY + balls[i][1])) * ((n + n) - (startY + balls[i][1]));

            int width_sub = (startX - balls[i][0]) * (startX - balls[i][0]);
            int height_sub = (startY - balls[i][1]) * (startY - balls[i][1]);

            {
                if (width > width_m) {
                    width = width_m;
                }
                if (height > height_n) {
                    height = height_n;
                }
                width = width + height_sub;
                height = height + width_sub;
                if (width > height) {
                    answer[i] = height;
                } else {
                    answer[i] = width;
                }
            }

            if (startX == balls[i][0]) {
                answer[i] = (nearM * 2) * (nearM * 2) + height_sub;
            }

            if (startY == balls[i][1]) {
                answer[i] = (nearN * 2) * (nearN * 2) + width_sub;
            }

        }

        return answer;
    }
}