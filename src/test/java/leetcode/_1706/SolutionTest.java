package leetcode._1706;

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
                        new int[][]{{1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}, {1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}},
                        new int[]{0, 1, 2, 3, 4, -1}
                )
        );
    }

    @DisplayName("상자의 상단에서 공을 떨어뜨렸을 때 공의 위치 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 공은_어디로_떨어질_것인가(int[][] grid, int[] result) {
        Solution sol = new Solution();
        assertThat(sol.findBall(grid)).isEqualTo(result);
    }
}
