package inflearn._1_7;

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
                        "gooG",
                        "YES"
                ),
                Arguments.of(
                        "Test",
                        "NO"
                )
        );
    }

    @DisplayName("회문 문자열이면 YES 아니면 NO 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 회문_문자열(String text, String result) {
        final inflearn._1_7.Solution solution = new inflearn._1_7.Solution();

        assertThat(solution.solution(text)).isEqualTo(result);
    }
}
