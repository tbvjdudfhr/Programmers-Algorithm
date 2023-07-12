package bookpractice.chapter9.없는숫자더하기;

public class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        boolean[] exist = new boolean[10];

        for (int num : numbers) {
            exist[num] = true;
        }

        for (int i = 0; i < 10; i++) {
            if (!exist[i]) {
                sum += i;
            }
        }

        return sum;
    }
}
