package inflearn._2_4;

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
                        10,
                        55
                ),
                Arguments.of(
                        1,
                        1
                )
        );
    }

    @DisplayName("피보나치 수열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 피보나치_수열(int input, int result) {
        assertThat(Solution.soluton(input)).isEqualTo(result);
    }
}
