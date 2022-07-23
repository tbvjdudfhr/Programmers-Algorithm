package leetcode._986;

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
                        new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}},
                        new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}},
                        new int[][]{{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}}
                ),
                Arguments.of(
                        new int[][]{{1, 3}, {5, 9}},
                        new int[][]{},
                        new int[][]{}
                )
        );
    }

    @DisplayName("2개의 리스트 겹치는 구간 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 간격_목록_교차(int[][] firstList, int[][] secondList, int[][] result) {
        Solution sol = new Solution();
        assertThat(sol.intervalIntersection(firstList, secondList)).isEqualTo(result);
    }
}
