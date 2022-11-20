package level2.weapon;

public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
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
        for (int i = 1; i  * i <= num; i++) {
            if(num % i == 0) {
                count++;
                if (i * i < num) {
                    count++;
                }
            }
        }

        return count;
    }
}
