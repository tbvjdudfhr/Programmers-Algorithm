package kakao.chat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();

        for (String message : record) {
            StringTokenizer tokenizer = new StringTokenizer(message);
            String cmd = tokenizer.nextToken();
            if (!cmd.equals("Leave")) {
                String id = tokenizer.nextToken();
                String name = tokenizer.nextToken();
                hashMap.put(id, name);
            }
        }

        for (String message : record) {
            StringTokenizer tokenizer = new StringTokenizer(message);
            String cmd = tokenizer.nextToken();
            if (cmd.equals("Enter")) {
                String id = tokenizer.nextToken();
                list.add(hashMap.get(id) + "님이 들어왔습니다.");
            } else if (cmd.equals("Leave")) {
                String id = tokenizer.nextToken();
                list.add(hashMap.get(id) + "님이 나갔습니다.");
            }
        }

        String[] answer = new String[list.size()];
        list.toArray(answer);

        return answer;
    }
}
