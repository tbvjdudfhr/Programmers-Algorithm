package level2.weapon;

public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 0; i < number; i++) {
            answer += validate(divisorCount(i), limit, power);
        }
        return answer;
    }

    private int validate(int count, int limit, int power) {
        if (count > limit) {
            return power;
        }
        return  count;
    }

    public static int divisorCount(int num)
    {
        int count = 0;
        int i = 1;
        while(i <= num)
        {
            if(num % i == 0)
                count += 1;
            i++;
        }
        return count;
    }
}
