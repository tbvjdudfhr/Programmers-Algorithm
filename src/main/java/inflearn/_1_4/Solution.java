package inflearn._1_4;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<String> solution(List<String> strings) {
        return strings.stream()
                .map(value -> new StringBuilder(value).reverse().toString())
                .collect(Collectors.toList());
    }
}
