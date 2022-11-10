package level2.foodfight;

public class Solution {
    public String solution(int[] food) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                builder.append(i);
            }
        }
        String answer = builder.toString();
        answer += "0" + builder.reverse();
        return answer;
    }
}
