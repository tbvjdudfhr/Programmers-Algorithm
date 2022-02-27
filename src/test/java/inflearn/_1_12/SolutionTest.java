package inflearn._1_12;

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
                        4,
                        "#****###**#####**#####**##** ",
                        "COOL"
                )
        );
    }

    @DisplayName("암호 해독 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 암호(int count, String text, String result) {
        final inflearn._1_12.Solution solution = new inflearn._1_12.Solution();

        assertThat(solution.solution(count, text)).isEqualTo(result);
    }
}
