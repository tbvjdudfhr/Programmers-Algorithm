package matrix;

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
                        6,
                        6,
                        new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}},
                        new int[]{8, 10, 25}
                ),
                Arguments.of(
                        3,
                        3,
                        new int[][]{{1, 1, 2, 2}, {1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}},
                        new int[]{1, 1, 5, 3}
                ),
                Arguments.of(
                        100,
                        97,
                        new int[][]{{1, 1, 100, 97}},
                        new int[]{1}
                )
        );
    }

    @DisplayName("행렬을 회전하여 가장 작은 숫자들은 순서대로 배열에 담는 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 행렬_테투리_회전하기(int rows, int columns, int[][] queries, int[] result) {
        Solution sol = new Solution();
        assertThat(sol.solution(rows, columns, queries)).isEqualTo(result);
    }
}
