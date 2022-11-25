package level2.halloffame;

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
                        new int[]{10, 100, 20, 150, 1, 100, 200},
                        new int[]{10, 10, 10, 20, 20, 100, 100}
                ), Arguments.of(
                        4,
                        new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000},
                        new int[]{0, 0, 0, 0, 20, 40, 70, 70, 150, 300}
                )
        );
    }

    @DisplayName("예의 전당 목록의 점수의 개수 k, 1일부터 마지막 날까지 출연한 가수들의 점수인 score가 주어졌을 때, 매일 발표된 명예의 전당의 최하위 점수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 명예의_전당(int k, int[] score, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(k, score)).isEqualTo(result);
    }
}
