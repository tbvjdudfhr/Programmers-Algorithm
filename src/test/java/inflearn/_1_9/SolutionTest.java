package inflearn._1_9;

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
                        "g0en2T0s8eSoft",
                        208
                ),
                Arguments.of(
                        "g0en1T0s4eSoft",
                        104
                )
        );
    }

    @DisplayName("문자와 숫자가 섞여있는 문자열에서 숫자만 추출하여 그 순서대로 자연수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 숫자만_추출(String text, int result) {
        final inflearn._1_9.Solution solution = new inflearn._1_9.Solution();

        assertThat(solution.solution(text)).isEqualTo(result);
    }
}
