package leetcode._14;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new String[]{"flower", "flow", "flight"},
                        "fl"
                )
        );
    }

    @DisplayName("문자열 배열 중에서 가장 긴 공통 접두사 문자열을 찾는 함수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 가장_긴_공통_접두사(String[] strs, String result) {
        Solution sol = new Solution();
        assertThat(sol.longestCommonPrefix(strs)).isEqualTo(result);
    }
}
