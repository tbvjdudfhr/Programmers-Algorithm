package inflearn._8_7;

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
                        5,
                        3,
                        10
                ),
                Arguments.of(
                        33,
                        19,
                        818809200
                )
        );
    }

    @DisplayName("조합의 경우수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 메모이제이션(int input, int input2, int result) {
        assertThat(Main.DFS(input, input2)).isEqualTo(result);
    }
}
