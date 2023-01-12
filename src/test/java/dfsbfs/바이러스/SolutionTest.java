package dfsbfs.바이러스;

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
                        new int[][]{{1, 2}, {2, 3}, {1, 5}, {5, 2}, {5, 6}, {4, 7}},
                        4
                )
        );
    }

    @DisplayName("1번 컴퓨터가 웜 바이러스에 걸렸을 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 바이러스(int[][] pair, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(pair)).isEqualTo(result);
    }
}