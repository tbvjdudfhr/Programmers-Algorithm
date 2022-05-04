package inflearn._10_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        8,
                        new int[]{5, 3, 7, 8, 6, 2, 9, 4},
                        4
                )
        );
    }

    @DisplayName("가장 길게 증가하는 원소들의 집합 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 최대_부분_증가수열(int input, int[] input2, int result) {
        Main.dp = new int[input];
        Main.solution(input2);
        assertThat(Arrays.stream(Main.dp).max().getAsInt()).isEqualTo(result);
    }
}
