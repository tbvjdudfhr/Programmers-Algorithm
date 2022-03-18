package inflearn._3_6;

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
                        14,
                        2,
                        new int[]{1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1},
                        8
                )
        );
    }

    @DisplayName("최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 최대_길이_연속부분수열(int input, int input2, int[] input3, int result) {
        assertThat(Main.solution(input, input2, input3)).isEqualTo(result);
    }
}
