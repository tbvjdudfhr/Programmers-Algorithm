package bookpractice.chapter7.가장큰수;

import java.util.Arrays;

public class Solution {
    public String solution(int[] numbers) {
        String[] nums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(nums, (s1, s2) -> {
            String case1 = s1 + s2;
            String case2 = s2 + s1;
            return case2.compareTo(case1);
        });

        StringBuilder sb = new StringBuilder();
        for (String num : nums) {
            sb.append(num);
        }

        String answer = sb.toString();

        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer;
    }
}