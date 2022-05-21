package kakao.report;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        HashMap<String, HashSet<String>> resultMap = new HashMap<>();

        for (String r : report) {
            String[] strings = r.split(" ");
            String reporter = strings[0];
            String reportedPerson = strings[1];

            AddKeyValue(reportMap, reporter, reportedPerson);
            AddKeyValue(resultMap, reportedPerson, reporter);
        }

        int[] answer = new int[id_list.length];

        for (int i = 0; i < answer.length; i++) {
            String reporter = id_list[i];
            if (reportMap.containsKey(reporter) == false) {
                continue;
            }

            for (String reportedPerson : reportMap.get(reporter)) {
                if (resultMap.get(reportedPerson).size() >= k) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }

    private void AddKeyValue(HashMap<String, HashSet<String>> map, String key, String value) {
        if (map.containsKey(key) == false) {
            map.put(key, new HashSet<>());
        }
        map.get(key).add(value);
    }
}
