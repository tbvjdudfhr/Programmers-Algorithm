package inflearn._10_1;

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
                        7,
                        21
                )
        );
    }

    @DisplayName("총 N계단일 때 올라갈 수 있는 방법의 수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 계단오르기(int input, int result) {
        Main.solution(input);
        assertThat(Main.dp[input]).isEqualTo(result);
    }
}
