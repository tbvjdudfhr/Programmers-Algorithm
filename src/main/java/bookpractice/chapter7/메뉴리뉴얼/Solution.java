package bookpractice.chapter7.메뉴리뉴얼;

import java.util.*;

public class Solution {

    private Map<String, Integer> menuCountMap;

    public String[] solution(String[] orders, int[] course) {
        List<String> answerList = new ArrayList<>();

        for (int courseSize : course) {
            menuCountMap = new HashMap<>();
            for (String order : orders) {
                char[] menuChars = order.toCharArray();
                Arrays.sort(menuChars);
                String sortedOrder = new String(menuChars);
                findCombinations(sortedOrder, courseSize, 0, "");
            }

            List<Map.Entry<String, Integer>> menuCounts = new ArrayList<>(menuCountMap.entrySet());
            menuCounts.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            int maxCount = 0;
            if (!menuCounts.isEmpty()) {
                maxCount = menuCounts.get(0).getValue();
            }

            if (maxCount < 2) {
                continue;
            }

            for (Map.Entry<String, Integer> entry : menuCounts) {
                if (entry.getValue() == maxCount && entry.getKey().length() == courseSize) {
                    answerList.add(entry.getKey());
                }
            }
        }

        Collections.sort(answerList);
        return answerList.toArray(new String[0]);
    }

    private void findCombinations(String order, int courseSize, int index, String combination) {
        if (combination.length() == courseSize) {
            menuCountMap.put(combination, menuCountMap.getOrDefault(combination, 0) + 1);
            return;
        }

        for (int i = index; i < order.length(); i++) {
            findCombinations(order, courseSize, i + 1, combination + order.charAt(i));
        }
    }
}