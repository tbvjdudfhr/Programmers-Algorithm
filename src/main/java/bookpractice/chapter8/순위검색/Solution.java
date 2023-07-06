package bookpractice.chapter8.순위검색;

import java.util.*;

public class Solution {
    public int[] solution(String[] info, String[] query) {
        Map<String, List<Integer>> applicants = new HashMap<>();

        for (String applicantInfo : info) {
            String[] infoArr = applicantInfo.split(" ");
            int score = Integer.parseInt(infoArr[4]);

            for (int i = 0; i < (1 << 4); i++) {
                StringBuilder keyBuilder = new StringBuilder();
                for (int j = 0; j < 4; j++) {
                    if ((i & (1 << j)) > 0) {
                        keyBuilder.append(infoArr[j]);
                    } else {
                        keyBuilder.append("-");
                    }
                }
                String key = keyBuilder.toString();
                applicants.putIfAbsent(key, new ArrayList<>());
                applicants.get(key).add(score);
            }
        }

        for (Map.Entry<String, List<Integer>> entry : applicants.entrySet()) {
            Collections.sort(entry.getValue());
        }

        int[] result = new int[query.length];

        for (int i = 0; i < query.length; i++) {
            String[] queryArr = query[i].replaceAll(" and", "").split(" ");
            String queryKey = String.join("", Arrays.copyOfRange(queryArr, 0, 4));
            int queryScore = Integer.parseInt(queryArr[4]);

            if (applicants.containsKey(queryKey)) {
                List<Integer> scores = applicants.get(queryKey);
                int count = binarySearch(scores, queryScore);
                result[i] = scores.size() - count;
            }
        }

        return result;
    }

    private int binarySearch(List<Integer> scores, int target) {
        int left = 0;
        int right = scores.size();

        while (left < right) {
            int mid = (left + right) / 2;
            if (scores.get(mid) >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}