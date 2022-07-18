package leetcode.binarysearch._74;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> args() {
        return Stream.of(
                /*Arguments.of(
                        new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}},
                        3,
                        true
                ),
                Arguments.of(
                        new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}},
                        13,
                        false
                ),*/
                Arguments.of(
                        new int[][]{{1}},
                        2,
                        false
                )
        );
    }

    @DisplayName("주어진 숫자의 2차원 배열에 있는지 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 행렬_숫자_찾기(int[][] matrix, int target, boolean result) {
        Solution sol = new Solution();
        assertThat(sol.searchMatrix(matrix, target)).isEqualTo(result);
    }
}
