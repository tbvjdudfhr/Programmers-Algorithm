package wadiz._1;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int solution(int[][] passwords, String s) {
        int answer = 0;

        int count = 1;
        String tmp = "";
        ArrayList<String>  list = new ArrayList<>();

        for (String str : s.split("#")) {
            if(count % 2 == 1) tmp = str;
            else {
                list.add(tmp + str);
            }
            count++;
        }

        for (int[] arr : passwords) {
            String dong = String.valueOf(arr[0]);
            String hosu = String.valueOf(arr[1]);
            for (String a : list) {
                if(a.equals(dong+hosu)) answer++;
            }
        }

        return answer;
    }
}