package grep._1;

import java.util.HashMap;

public class Solution {
    public boolean[] solution(String[] infos, String[] actions) {
        boolean[] answer = new boolean[actions.length];

        HashMap<String, String> infoMap = new HashMap<>();
        for (String info : infos) {
            String[] s = info.split(" ");
            infoMap.put(s[0], s[1]);
        }

        boolean login = false;
        boolean add = false;
        int count = 0;
        for (String action : actions) {
            if(action.indexOf("LOGIN") != -1) {
                String[] l = action.split(" ");
                String id = l[1];
                String pwd = l[2];
                if(infoMap.containsKey(id) && infoMap.get(id).equals(pwd) && !login) {
                    login = true;
                    answer[count] = true;
                } else answer[count] = false;

            } else if (action.indexOf("ORDER") != -1) {
                if(add) {
                    add = false;
                    answer[count] = true;
                } else answer[count] = false;
            } else {
                if(login) {
                    add = true;
                    answer[count] = true;
                } else {
                    answer[count] = false;
                }
            }
            count++;
        }
        return answer;
    }
}
