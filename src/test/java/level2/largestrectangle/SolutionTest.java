package level2.largestrectangle;

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
                        new int[][]{{0, 0, 1, 1}, {1, 1, 1, 1}},
                        4
                )
        );
    }

    @DisplayName("표에서 1로 이루어진 가장 큰 정사각형을 찾아 넓이 구하기 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 가장_큰_정사각형_찾기(int[][] board, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(board)).isEqualTo(result);
    }
}
