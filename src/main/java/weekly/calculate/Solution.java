package weekly.calculate;

class Solution {
    public long solution(int price, int money, int count)     {
        long answer = -1;

        answer = money - getSum(price, count);

        if(answer >= 0)
            return 0;
        else
            return answer * -1;
    }

    public static int getSum(int price, int count) {
        if (count == 1)
            return price;
        return price * (count) + getSum(price, count-1);
    }
}