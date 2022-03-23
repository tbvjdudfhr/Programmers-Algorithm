package inflearn._4_5;

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
                        new int[]{13, 15, 34, 23, 45, 65, 33, 11, 26, 42},
                        143
                )
        );
    }

    @DisplayName("기록한 값중 K번째로 큰 수를 출력 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void k번째_큰_수(int input, int[] input2, int result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}
