package season3_2.level1;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++) if ((n - 1) % i == 0) return i;
        return answer;
    }
}