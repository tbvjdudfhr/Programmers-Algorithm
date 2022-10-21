package level2.rollcake;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> toppingSet = new HashSet<>();
        Map<Integer, Integer> toppingMap =Arrays.stream(topping).boxed().collect(Collectors.groupingBy(e -> e,
                Collectors.reducing(0, e -> 1, Integer::sum)));
        for (int i = 0; i < topping.length; i++) {
            Integer key = Integer.valueOf(topping[i]);
            if(toppingMap.containsKey(key)) {
                if(toppingMap.get(key) == 1) {
                    toppingMap.remove(key);
                } else {
                    toppingMap.put(key, toppingMap.get(key) - 1);
                }
            }
            toppingSet.add(key);
            if(toppingMap.size() == toppingSet.size()) {
                answer++;
            }
        }

        return answer;
    }
}

