package weekly._4weeks;

import java.util.HashMap;

class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < languages.length; i++) {
            map.put(languages[i], preference[i]);
        }

        int maxSum= 0;
        for (String x : table) {
            String[] str = x.split(" ");
            int sum = 0;
            for (int i = 1; i < str.length; i++) {
                String lang = str[i];
                int jumsu = str.length - i;
                if(map.containsKey(lang)) {
                    sum += map.get(lang) * jumsu;
                }
            }
            if(maxSum < sum) {

                answer = str[0];
                maxSum = sum;
            } else if (maxSum == sum) {
                if(answer.charAt(0) > str[0].charAt(0)) answer = str[0];
            }
        }

        return answer;
    }
}