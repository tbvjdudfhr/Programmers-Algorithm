package bracket;

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
                        "[](){}",
                        3
                ),
                Arguments.of(
                        "}]()[{",
                        2
                ),
                Arguments.of(
                        "[)(]",
                        0
                ),
                Arguments.of(
                        "}}}",
                        0
                )
        );
    }

    @DisplayName("왼쪽으로 회전시켰을 때 올바른 괄호 문자열이 되는 개수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 괄호_회전하기(String s, int result) {
        Solution sol = new Solution();
        assertThat(sol.solution(s)).isEqualTo(result);
    }
}
