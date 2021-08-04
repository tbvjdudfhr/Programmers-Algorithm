package weekly.calculate;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = price * getSum(count) - money;

        return Math.max(answer, 0);
    }

    public static long getSum(int n) {
        return (n * (n + 1)) / 2;
    }
}