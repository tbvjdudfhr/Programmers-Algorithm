package nhn.first;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Solution {
    int answer = 0;
    HashSet<Integer> integerHashSet = new HashSet<>();

    public int solution(int[][] cards1, int[][] cards2) {
        boolean flag;
        for (int i = 0; i < cards1.length; i++) {
            flag = validate(cards1[i], cards2[i]);
            if (i > 0 && !flag) {
                flag = validatePreviousRound(cards1[i - 1], cards1[i]);

                if (!flag) {
                    validatePreviousRound(cards2[i - 1], cards2[i]);
                }
            }
        }

        return answer;
    }

    private boolean validatePreviousRound(int[] array1, int[] array2) {
        HashSet<Integer> set = arrToSet(array1);
        int count = 0;
        for (int num : array2) {
            if (set.contains(num)) {
                count++;
            }

            if (count == 2) {
                answer++;
                return true;
            }
        }

        HashSet<Integer> set2 = arrToSet(array2);
        count = 0;
        for (int num : array1) {
            if (set2.contains(num)) {
                count++;
            }

            if (count == 2) {
                answer++;
                return true;
            }
        }

        return false;
    }

    private boolean validate(int[] array1, int[] array2) {
        integerHashSet.clear();
        HashSet<Integer> set1 = arrToSet(array1);
        HashSet<Integer> set2 = arrToSet(array2);
        integerHashSet.addAll(set1);
        integerHashSet.addAll(set2);
        int validateCount = set1.size() + set2.size();
        if (integerHashSet.size() < validateCount) {
            answer++;
            return true;
        }

        return false;
    }

    private HashSet<Integer> arrToSet(int[] array) {
        return (HashSet<Integer>) Arrays.stream(array)
                .boxed()
                .collect(Collectors.toSet());
    }
}
