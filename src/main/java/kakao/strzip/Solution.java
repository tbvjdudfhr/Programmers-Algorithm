package kakao.strzip;

class Solution {
    public int solution(String s) {
        if (s.length() == 1) return 1;

        int answer = s.length();

        for (int i = 1; i < s.length() / 2 + 1; i++) {
            String str = s.substring(0, i);
            String zipStr = "";
            int count = 1;
            int lastIndex = 0;
            for (int j = i; j + i <= s.length(); j += i) {
                String nextStr = s.substring(j, j + i);
                if (str.equals(nextStr)) {
                    count++;
                } else {
                    if (count > 1) zipStr += count;
                    zipStr += str;
                    str = nextStr;
                    count = 1;
                }
                lastIndex = j + i;
            }
            if (count > 1) zipStr += count;

            zipStr += str;

            if (lastIndex < s.length())
                zipStr += s.substring(lastIndex);

            answer = Math.min(answer, zipStr.length());
        }

        return answer;
    }
}