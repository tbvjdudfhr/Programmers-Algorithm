package pccp._2.체육대회;

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
                        new int[][] {{40, 10, 10}, {20, 5, 0}, {30, 30, 30}, {70, 0, 70}, {100, 100, 100}},
                        210
                ),
                Arguments.of(
                        new int[][] {{20, 30}, {30, 20}, {20, 30}},
                        60
                )
        );
    }

    @DisplayName("당신의 반 학생들의 각 종목에 대한 능력치를 나타내는 2차원 정수 배열 ability가 주어졌을 때, 선발된 대표들의 해당 종목에 대한 능력치 합의 최대값 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 체육대회(int[][] ability, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(ability)).isEqualTo(result);
    }
}