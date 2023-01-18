package level2.두개뽑아서더하기;

import java.util.HashSet;

public class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                hashSet.add(numbers[i] + numbers[j]);
            }
        }
        return hashSet.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
