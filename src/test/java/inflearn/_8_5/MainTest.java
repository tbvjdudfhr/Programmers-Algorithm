package inflearn._8_5;

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
                        new Integer[]{1, 2, 5},
                        15,
                        3
                )
        );
    }

    @DisplayName("동전교환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 동전교환(int input, Integer[] input2, int input3, int result) {
        Main.n = input;
        Main.typesCoins = input2;
        Main.changeMoney = input3;
        Main.DFS(0, 0);
        assertThat(Main.changeCount).isEqualTo(result);
    }
}
