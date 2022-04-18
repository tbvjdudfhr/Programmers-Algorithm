package inflearn._8_8;

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
                        4,
                        16,
                        "3 1 2 4 "
                )
        );
    }

    @DisplayName("수열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 수열_추측하기(int input, int input2, String result) {
        Main.number = input;
        Main.finalNumber = input2;
        Main.combinations = new int[input];
        Main.answer = new int[input];
        Main.check = new int[input + 1];
        for (int i = 0; i < Main.number; i++) {
            Main.combinations[i] = Main.combination(input - 1, i);
        }
        Main.dfs(0, 0);
        assertThat(Main.solution).isEqualTo(result);
    }
}
