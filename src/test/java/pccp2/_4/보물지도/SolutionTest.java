package pccp2._4.보물지도;

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
                        4,
                        4,
                        new int[][]{{2, 3}, {2, 3}},
                        5
                ),
                Arguments.of(
                        5,
                        4,
                        new int[][]{{1, 4}, {2, 1}, {2, 2}, {2, 3}, {3, 3}, {4, 1}, {4, 3}, {5, 3}},
                        -1
                )
        );
    }

    @DisplayName("수가 보물이 있는 칸으로 이동하는데 필요한 최소 시간 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 보물_지도(int n, int m, int[][] hole, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(n, m, hole)).isEqualTo(result);
    }
}