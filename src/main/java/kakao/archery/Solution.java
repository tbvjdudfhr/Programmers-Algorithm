package kakao.archery;

import java.util.Arrays;

public class Solution {
    int[] mn = new int[12];
    int[] arrow = new int[12];

    public int[] solution(int n, int[] info) {
        Arrays.fill(mn, -1);
        bt(0, n, info);

        if (mn[0] == -1) {
            int[] ret_arr = new int[1];
            ret_arr[0] = -1;

            return ret_arr;
        }

        int[] ret = new int[11];

        for (int i = 0; i < 11; i++) {
            ret[i] = mn[i];
        }

        return ret;
    }

    public boolean cmp(int[] a, int[] b) {
        for (int i = 11; i >= 0; i--) {
            if (a[i] != b[i]) {
                return a[i] > b[i];
            }
        }

        return false;
    }

    public void bt(int idx, int left, int[] info) {
        if (idx == 10) {
            arrow[idx] = left;
            int score = 0;

            for (int i = 0; i <= 10; i++) {
                if (arrow[i] > info[i]) {
                    score += (10 - i);
                } else if (info[i] != 0) {
                    score -= (10 - i);
                }
            }

            if (score <= 0) {
                return;
            }

            arrow[11] = score;

            if (cmp(arrow, mn)) {
                for (int i = 0; i < 12; i++) {
                    mn[i] = arrow[i];
                }
            }

            return;
        }

        for (int i = 0; i <= left; i++) {
            arrow[idx] = i;
            bt(idx + 1, left - i, info);
        }
    }


}
