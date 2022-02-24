package inflearn._1_8;

public class Solution {

    private static final String YES = "YES";
    private static final String NO = "NO";
    private static final String REGEX = "[^a-zA-Z]";
    private static final String REPLACEMENT = "";

    public String solution(String text) {
        text = text.replaceAll(REGEX, REPLACEMENT);
        String reverseText = new StringBuilder(text).reverse().toString();

        if(text.equalsIgnoreCase(reverseText)) {
            return YES;
        }

        return NO;
    }
}
