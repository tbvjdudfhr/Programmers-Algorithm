package inflearn._3_4;

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
                        6,
                        new int[]{1, 2, 1, 3, 1, 1, 1, 2},
                        3
                )
        );
    }

    @DisplayName("연속부분 수열의 합이 특정숫자 M이 되는 경우가 몇번 있는지 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 연속_부분수열(int input, int[] input2, int result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}
