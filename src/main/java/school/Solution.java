package school;

class Solution {
    public static final int MOD = 1000000007;

    public int solution(int m, int n, int[][] puddles) {
        int[][] street = new int[n + 1][m + 1];

        for (int[] puddle : puddles) {
            street[puddle[1]][puddle[0]] = -1;
        }

        street[1][1] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (street[i][j] == -1) {
                    street[i][j] = 0;
                    continue;
                }

                if (i != 0) {
                    street[i][j] += street[i - 1][j] % MOD;
                }

                if (j != 0) {
                    street[i][j] += street[i][j - 1] % MOD;
                }
            }
        }

        return street[n][m] % MOD;
    }
}

