package kakao.bracket;

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
                        "(()())()",
                        "(()())()"
                ),
                Arguments.of(
                        ")(",
                        "()"
                ),
                Arguments.of(
                        "()))((()",
                        "()(())()"
                )
        );
    }

    @DisplayName("올바른 괄호 문자열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 괄호_변환(String p, String result) {
        Solution sol = new Solution();
        assertThat(sol.solution(p)).isEqualTo(result);
    }
}
