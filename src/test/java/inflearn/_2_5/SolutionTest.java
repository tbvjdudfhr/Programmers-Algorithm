package inflearn._2_5;

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
                        20,
                        8
                )
        );
    }

    @DisplayName("에라토스테네스 체를 통한 소수 개수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 소수(int input, int result) {
        assertThat(Solution.soluton(input)).isEqualTo(result);
    }
}
