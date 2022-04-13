package inflearn._8_1;

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
                        new int[]{1, 3, 5, 6, 7, 10},
                        "YES"
                )
        );
    }

    @DisplayName("합이 같은 부분집합 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 합이_같은_부분집합(int[] input, String result) {
        Main.DFS(0, 0, input);
        assertThat(Main.answer).isEqualTo(result);
    }
}
