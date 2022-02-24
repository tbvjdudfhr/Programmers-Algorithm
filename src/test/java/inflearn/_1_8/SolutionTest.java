package inflearn._1_8;

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
                        "found7, time: study; Yduts; emit, 7Dnuof",
                        "YES"
                ),
                Arguments.of(
                        "found7, time: sttdy; Yduts; emit, 7Dnuof",
                        "NO"
                )
        );
    }

    @DisplayName("팰린드롬 문자열이면 YES 아니면 NO 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 유효한_팰린드롬(String text, String result) {
        final inflearn._1_8.Solution solution = new inflearn._1_8.Solution();

        assertThat(solution.solution(text)).isEqualTo(result);
    }

}
