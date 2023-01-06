package level2.개인정보수집유효기간;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    private static final String REGEX = " ";
    private static final String TARGET = ".";
    private static final String REPLACEMENT = "-";

    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        LocalDate date = LocalDate.parse(replace(today));
        HashMap<String, LocalDate> hashMap = new HashMap<>();
        for (String term : terms) {
            String[] split = term.split(REGEX);
            hashMap.put(split[0], date.minusMonths(Integer.parseInt(split[1])));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(REGEX);
            if (!isAfter(LocalDate.parse(replace(split[0])), hashMap.get(split[1]))) {
                list.add(i + 1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private String replace(String text) {
        return text.replace(TARGET, REPLACEMENT);
    }

    private boolean isAfter(LocalDate date, LocalDate date2) {
        return date.isAfter(date2);
    }
}
