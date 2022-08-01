package leetcode._1091;

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
                        new int[][]{{0, 1}, {1, 0}},
                        2
                ),
                Arguments.of(
                        new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}},
                        4
                ),
                Arguments.of(
                        new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 0}},
                        -1
                )
        );
    }

    @DisplayName("이진 행렬 그리드가 주어지면 행렬에서 가장 짧은 클리어 경로 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 이진_행렬의_최단_경로(int[][] grid, int result) {
        Solution sol = new Solution();
        assertThat(sol.shortestPathBinaryMatrix(grid)).isEqualTo(result);
    }
}