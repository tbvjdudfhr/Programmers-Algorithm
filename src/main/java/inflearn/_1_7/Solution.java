package inflearn._1_7;

public class Solution {
    public String solution(String text) {
        String reverseText = new StringBuilder(text).reverse().toString();

        if (text.equalsIgnoreCase(reverseText)) {
            return "YES";
        }

        return "NO";
    }
}
