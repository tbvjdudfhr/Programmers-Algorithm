package inflearn._1_12;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    private static final int SECRET_LENGTH = 7;

    public String solution(int count, String str) {
        return IntStream.range(0, count)
                .mapToObj(index -> str.substring(index * SECRET_LENGTH, index * SECRET_LENGTH + SECRET_LENGTH))
                .map(it -> (char) stringToInt(it))
                .map(it -> it.toString())
                .collect(Collectors.joining());
    }

    private int stringToInt(String it) {
        return Integer.parseInt(it.replaceAll("#", "1").replaceAll("\\*", "0"), 2);
    }
}
