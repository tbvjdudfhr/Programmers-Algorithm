package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

class Test2 {
    public static final int MAX_DAYS = 30;

    public int solution(int leave, String day, int[] holidays) {
        int answer = -1;
        if (leave > MAX_DAYS) return MAX_DAYS;

        HashSet<Integer> integers = Arrays.stream(holidays).boxed().collect(Collectors.toCollection(HashSet::new));
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = leave;
        for (int holiday : holidays) {
            list.add(holiday);
            int tmp = holiday;
            while (cnt > 0) {
                tmp++;
                if (!integers.contains(tmp)) cnt--;
                list.add(tmp);
            }
            answer = Math.max(answer, list.size());
            list.clear();
        }
        return answer;
    }
}