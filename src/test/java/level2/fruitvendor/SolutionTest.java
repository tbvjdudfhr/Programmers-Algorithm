package level2.fruitvendor;

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
                        3,
                        4,
                        new int[]{1, 2, 3, 1, 2, 3, 1},
                        8
                ), Arguments.of(
                        4,
                        3,
                        new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2},
                        33
                )
        );
    }

    @DisplayName("사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m, 사과들의 점수 score가 주어졌을 때, 과일 장수가 얻을 수 있는 최대 이익 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 과일_장수(int k, int m, int[] score, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(k, m, score)).isEqualTo(result);
    }
}
