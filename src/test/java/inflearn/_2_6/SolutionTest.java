package inflearn._2_6;

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
                        "23",
                        32
                ),
                Arguments.of(
                        "190",
                        91
                )
        );
    }

    @DisplayName("숫자 뒤집기 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 뒤집은_소수(String input, int result) {
        assertThat(Solution.reverseStringToInt(input)).isEqualTo(result);
    }
}
