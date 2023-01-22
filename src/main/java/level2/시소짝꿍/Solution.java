package level2.시소짝꿍;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Arrays.sort(weights);
        HashMap<Double, Integer> map = new HashMap<>();

        for (Integer weight : weights) {
            double w = Double.valueOf(weight);
            if (map.containsKey(w)) {
                answer += map.get(w);
            }
            map.put(w, map.getOrDefault(w, 0) + 1);
            map.put(w * 4 / 3, map.getOrDefault(w * 4 / 3, 0) + 1);
            map.put(w * 1.5, map.getOrDefault(w * 1.5, 0) + 1);
            map.put(w * 2, map.getOrDefault(w * 2, 0) + 1);
        }
        return answer;
    }
}
