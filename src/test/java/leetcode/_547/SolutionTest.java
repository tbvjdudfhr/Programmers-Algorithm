package leetcode._547;

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
                        new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 1, 1}},
                        1
                ),
                Arguments.of(
                        new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}},
                        3

                ),
                Arguments.of(
                        new int[][]{{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}},
                        1
                )
        );
    }

    @DisplayName("n개의 도시 중 연결된 도시 지방의 갯수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 지방_갯수(int[][] isConnected, int result) {
        Solution sol = new Solution();
        assertThat(sol.findCircleNum(isConnected)).isEqualTo(result);
    }
}
