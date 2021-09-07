package weekly._6weeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] weights, String[] head2head) {
        int len = weights.length;
        int[] answer = new int[len];

        ArrayList<User> list = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            int winCnt = 0, cnt = 0, fightCnt = 0;
            for (int j = 0; j < len; j++) {
                char c = head2head[i].charAt(j);
                if (c != 'N') fightCnt++;

                if (c == 'W') {
                    winCnt++;
                    if (weights[i] < weights[j]) cnt++;
                }
            }
            int rate = fightCnt == 0 ? 0 : (int) ((double) winCnt / fightCnt * 1000000);
            list.add(new User(i + 1, rate, cnt, weights[i]));
        }

        Collections.sort(list, new UserSort());

        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            answer[i] = user.num;
        }

        return answer;
    }

    public class User {
        int num;
        int rate;
        int cnt;
        int weight;

        public User(int num, int rate, int cnt, int weight) {
            this.num = num;
            this.rate = rate;
            this.cnt = cnt;
            this.weight = weight;
        }
    }

    private class UserSort implements Comparator<User> {

        @Override
        public int compare(User o1, User o2) {
            if (o1.rate != o2.rate) return o2.rate - o1.rate;
            if (o1.cnt != o2.cnt) return o2.cnt - o1.cnt;
            if (o1.weight != o2.weight) return o2.weight - o1.weight;
            return o1.num - o1.num;
        }
    }
}