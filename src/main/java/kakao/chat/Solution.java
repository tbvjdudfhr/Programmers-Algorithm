package kakao.chat;

import java.util.HashMap;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> hashMap = new HashMap<>();
        int count = 0;

        for (String message: record) {
            String[] strings = message.split(" ");
            if(!strings[0].equals("Leave")) {
                hashMap.put(strings[1], strings[2]);
                count++;
            }
        }

        String[] answer = new String[count];

        for (int i = 0; i < record.length; i++) {
            String[] strings = record[i].split(" ");
            if(strings[0].equals("Enter")) {
                answer[i]  = hashMap.get(strings[1]) + "님이 들어왔습니다.";
            } else if (strings[0].equals("Leave")) {
                answer[i]  = hashMap.get(strings[1]) + "님이 나갔습니다.";
            }
        }

        return answer;
    }
}
