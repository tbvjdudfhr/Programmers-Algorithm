package level2.makinghamburgers;

import java.util.Arrays;

public class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        String burger = "1231";
        String str = Arrays.toString(ingredient).replaceAll("[^0-9]","");

        while (str.indexOf(burger) != -1) {
            str = str.replace(burger, "");
            answer++;
        }
        return answer;
    }
}
