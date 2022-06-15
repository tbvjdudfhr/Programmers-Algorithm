package kakao.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        "1S2D*3T",
                        37
                ),
                Arguments.of(
                        "1D2S#10S",
                        9
                ),
                Arguments.of(
                        "1D2S0T",
                        3
                )
        );
    }

    @DisplayName("다트 게임의 점수 계산 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 다트_게임(String dartResult, String result) {
        Solution sol = new Solution();
        assertThat(sol.solution(dartResult)).isEqualTo(result);
    }
}
