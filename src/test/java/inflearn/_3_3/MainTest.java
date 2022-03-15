package inflearn._3_3;

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
                        3,
                        new int[]{12, 15, 11, 20, 25, 10, 20, 19, 13, 15},
                        56
                )
        );
    }

    @DisplayName("연속된 K일간의 최대 매출액 계산 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 최대_매출(int input, int[] input2, int result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}
