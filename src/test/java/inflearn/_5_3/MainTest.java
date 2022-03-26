package inflearn._5_3;

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
                        new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}},
                        new int[]{1, 5, 3, 5, 1, 2, 1, 4},
                        4
                )
        );
    }

    @DisplayName("크레인 인형뽑기 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 크레인_인형뽑기(int[][] input, int[] input2, int result) {
        assertThat(Main.solution(input, input2)).isEqualTo(result);
    }
}

