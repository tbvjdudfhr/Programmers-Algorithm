package level2.시소짝꿍;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < weights.length; i++) {
            int weight = weights[i];
            if (hashMap.containsKey(weight)) {
                HashSet<Integer> set = hashMap.get(weight);
                set.add(i);
            } else {
                hashMap.put(weight, new HashSet<>(Arrays.asList(i)));
            }
        }
        Set<Integer> weightSet = Arrays.stream(weights).boxed().collect(Collectors.toSet());

        for (Integer key : weightSet) {
            int duplicate = hashMap.get(key).size();
            int partnerWeight;

            int weightX2 = key * 2;
            if (weightX2 % 3 == 0) {
                partnerWeight = weightX2 / 3;
                if (hashMap.containsKey(partnerWeight)) {
                    answer += getCount(hashMap, partnerWeight, duplicate);
                }
            }

            if (weightX2 % 4 == 0) {
                partnerWeight = weightX2 / 4;
                if (hashMap.containsKey(partnerWeight)) {
                    answer += getCount(hashMap, partnerWeight, duplicate);
                }
            }

            int weightX3 = key * 3;
            if (weightX3 % 2 == 0) {
                partnerWeight = weightX3 / 2;
                if (hashMap.containsKey(partnerWeight)) {
                    answer += getCount(hashMap, partnerWeight, duplicate);
                }
            }

            if (weightX3 % 4 == 0) {
                partnerWeight = weightX3 / 4;
                if (hashMap.containsKey(partnerWeight)) {
                    answer += getCount(hashMap, partnerWeight, duplicate);
                }
            }

            int weightX4 = key * 4;
            if (weightX4 % 2 == 0) {
                partnerWeight = weightX4 / 2;
                if (hashMap.containsKey(partnerWeight)) {
                    answer += getCount(hashMap, partnerWeight, duplicate);
                }
            }

            if (weightX4 % 3 == 0) {
                partnerWeight = weightX4 / 3;
                if (hashMap.containsKey(partnerWeight)) {
                    answer += getCount(hashMap, partnerWeight, duplicate);
                }
            }

            if (duplicate > 1) {
                answer += (long) (duplicate * duplicate - 1) / 2;
            }

            hashMap.remove(key);
        }
        return answer;
    }

    private long getCount(HashMap<Integer, HashSet<Integer>> map, int weight, int duplicate) {
        return map.get(weight).size() * duplicate;
    }
}
