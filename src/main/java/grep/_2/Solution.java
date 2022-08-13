package grep._2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Solution {
    public String[] solution(String[] grades) {
        String[] g = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
        ArrayList<String> list = new ArrayList<>();
        list.addAll(List.of(g));

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        for (String x : grades) {
            String[] s = x.split(" ");
            String bunho = s[0];
            String grade = s[1];

            if (map.containsKey(bunho)) {
                if (list.indexOf(grade) < list.indexOf(map.get(bunho))) {
                    map.remove(bunho, map.get(bunho));
                    map.put(bunho, grade);
                }
            } else {
                map.put(bunho, grade);
            }
        }

        ArrayList<String> result = new ArrayList<>();
        for (String x : g) {
            map.forEach((key, value) -> {
                if (value.equals(x)) result.add(key + " " + value);
            });
        }

        return result.toArray(new String[0]);
    }
}
