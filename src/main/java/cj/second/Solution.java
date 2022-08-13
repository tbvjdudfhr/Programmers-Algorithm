package cj.second;

class Solution {
    public int solution(int[] x, int[] y, int[] r, int[] v) {
        int answer = 0;
        int l = 100, r2 = 0, b = 100, t = 0;
        for (int i = 0; i < x.length; i++) {
            l = Math.min(l, x[i] - r[i]);
            r2 = Math.max(r2, x[i] + r[i]);
            b =  Math.min(b, y[i] - r[i]);
            t =  Math.max(t, y[i] + r[i]);
        }

        int count = 0;
        for (int j = 0; j < v.length; j=j+2) {
            int x1 = v[j];
            int y1 = v[j+1];
            int convertX = l + x1%(r2 -l);
            int convertY = b + y1%(t - b);

            for (int k = 0; k < x.length; k++) {
                if (Math.pow(r[k], 2) >= (Math.pow(x[k] - convertX, 2) + Math.pow(y[k] - convertY, 2)))
                    count++;
            }
        }
        answer =  (int) (((double) count / (v.length / 2)) * (r2 - l) * (t - b));

        return answer;
    }
}