package inflearn._1_6;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public String solution(String str) {
        return IntStream.range(0, str.length())
                .filter(i -> str.indexOf(str.charAt(i)) == i)
                .mapToObj(i -> String.valueOf(str.charAt(i)))
                .collect(Collectors.joining());
    }
}
