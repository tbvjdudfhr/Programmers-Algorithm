package leetcode._91;

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
                        "12",
                        2
                ),
                Arguments.of(
                        "226",
                        3
                )
        );
    }

    @DisplayName("숫자만 포함하는 문자열 s가 주어지면 이를 디코딩하는 방법의 수를 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 디코딩_방법(String s, int result) {
        Solution sol = new Solution();
        assertThat(sol.numDecodings(s)).isEqualTo(result);
    }
}
