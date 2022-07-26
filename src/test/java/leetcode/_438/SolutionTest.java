package leetcode._438;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        "cbaebabacd",
                        "abc",
                        Arrays.asList(0,6)
                ),
                Arguments.of(
                        "abab",
                        "ab",
                        Arrays.asList(0,1,2)
                )
        );
    }

    @DisplayName("두 개의 문자열 s와 p가 주어지면 s에 있는 p의 아나그램의 시작 인덱스 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 아나그램_찾기(String s, String p, List<Integer> result) {
        Solution sol = new Solution();
        assertThat(sol.findAnagrams(s, p)).isEqualTo(result);
    }
}