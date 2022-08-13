package wadiz._2;

import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public String[] solution(String[] code) {
        String[] answer = {};

        int tmp = 0;
        String[] arr = new String[1000];
        for (String str : code) {
            int leng = 0;
            int fIndex = str.indexOf(".");
            int lIndex = str.lastIndexOf(".");
            if(fIndex != -1) {
                leng = lIndex - fIndex + 1;
                System.out.println(leng);
            }
            if(str.indexOf("print") != -1) {
                if(tmp < leng) {

                } else {

                }
            }

            if(str.indexOf("=") != -1) {
                String value = str.substring(str.indexOf("=") -1);
                arr[leng] = (arr[leng] != null) ? arr[leng] + "#" + value : value;
            }

            tmp = leng;
        }


        return answer;
    }
}