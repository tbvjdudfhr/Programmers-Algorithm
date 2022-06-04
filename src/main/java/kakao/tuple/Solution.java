package kakao.tuple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Solution {
    public int[] solution(String s) {
        StringTokenizer st = new StringTokenizer(s, "{}");

        ArrayList<String> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            if (!temp.equals(",")) {
                list.add(temp);
            }
        }

        Collections.sort(list, Comparator.comparingInt(String::length));


        ArrayList<String> answerList = new ArrayList<>();

        for (String temp : list) {
            String[] arr = temp.split(",");

            for (int i = 0; i < arr.length; i++) {
                if (!answerList.contains(arr[i])) {
                    answerList.add(arr[i]);
                }
            }
        }

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = Integer.parseInt(answerList.get(i));
        }

        return answer;
    }
}
