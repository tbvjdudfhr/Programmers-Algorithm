package inflearn._10_5;

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
                        15,
                        new int[]{1, 2, 5},
                        3
                )
        );
    }

    @DisplayName("거스름돈을 가장 적은 수의 동전으로 교환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 동전교환(int input, int[] input2, int result) {
        Main.dp = new int[input + 1];
        Main.changeMoney = input;
        assertThat(Main.solution(input2)).isEqualTo(result);
    }
}
