package inflearn._2_7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 0, 1, 1, 1, 0, 0, 1, 1, 0},
                        10
                )
        );
    }

    @DisplayName("연속된 정답 계산 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 점수계산(int[] input, int result) {
        assertThat(Main.solution(input)).isEqualTo(result);
    }
}
