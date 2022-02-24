package inflearn._1_9;

import java.util.stream.Collectors;

public class Solution {
    public int solution(String text) {

        return Integer.parseInt(text.chars()
                .filter(value -> Character.isDigit(value))
                .mapToObj(value -> String.valueOf((char) value))
                .collect(Collectors.joining()));
    }
}
