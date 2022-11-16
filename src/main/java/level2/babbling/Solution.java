package level2.babbling;

public class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String str : babbling) {
            boolean flag = true;
            String replaceAll = str.replaceAll("aya", "1")
                    .replaceAll("ye", "2")
                    .replaceAll("woo", "3")
                    .replaceAll("ma", "4");
            for (int i = 1; i < replaceAll.length(); i++) {
                char prevCh = replaceAll.charAt(i - 1);
                char ch = replaceAll.charAt(i);
                if (prevCh == ch || !Character.isDigit(prevCh) || !Character.isDigit(ch)) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                answer++;
            }
        }
        return answer;
    }
}
