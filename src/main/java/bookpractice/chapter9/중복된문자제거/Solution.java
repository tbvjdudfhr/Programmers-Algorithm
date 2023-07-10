package bookpractice.chapter9.중복된문자제거;

public class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
