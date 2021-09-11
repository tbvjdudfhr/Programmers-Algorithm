package inflearn._1_5;

public class Solution {
    public String solution(String str) {
        String answer;
        char[] arr = str.toCharArray();
        int lt = 0, rt = arr.length -1;

        while (lt < rt) {
            if(!Character.isAlphabetic(arr[lt])) lt++;
            else if(!Character.isAlphabetic(arr[rt])) rt--;
            else {
                char tmp = arr[lt];
                arr[lt]  = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(arr);

        return answer;
    }
}
