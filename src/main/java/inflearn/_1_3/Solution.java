package inflearn._1_3;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(String text) {
        String[] strings = text.split(" ");

        return Arrays.stream(strings)
                .max(Comparator.comparingInt(String::length))
                .get();
    }
}
