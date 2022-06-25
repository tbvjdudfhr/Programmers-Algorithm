package kakao.parking;

import java.util.HashMap;
import java.util.TreeMap;

public class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, Integer> intime = new HashMap<>();
        TreeMap<String, Integer> result = new TreeMap<>();

        for (String r : records) {
            String[] str = r.split(" ");
            if (str[2].equals("IN")) {
                intime.put(str[1], convert(str[0]));
                if (!result.containsKey(str[1]))
                    result.put(str[1], 0);
            } else {
                result.put(str[1], result.get(str[1]) + convert(str[0]) - intime.get(str[1]));
                intime.remove(str[1]);
            }
        }

        intime.forEach((k, v) -> {
            result.put(k, result.get(k) + 23 * 60 + 59 - v);
        });

        int[] answer = new int[result.size()];
        int idx = 0;
        for (int val : result.values()) {
            answer[idx] = fees[1];
            if (val > fees[0]) {
                answer[idx] += Math.ceil((val - fees[0]) / (double) fees[2]) * fees[3];
            }
            ++idx;
        }
        return answer;
    }

    public int convert(String time) {
        String[] str = time.split(":");
        return Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
    }
}
