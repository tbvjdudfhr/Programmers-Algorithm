package level2.coke;

public class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (true) {
            if ( n < a) {
                break;
            }

            int bottles = n / a * b;
            int moreBottles = n % a;
            answer += bottles;
            n = bottles + moreBottles;
        }
        return answer;
    }
}
