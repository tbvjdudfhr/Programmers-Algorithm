package level2.당구연습;


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
                        10,
                        10,
                        3,
                        7,
                        new int[][]{{7, 7}, {2, 7}, {7, 3}},
                        new int[]{52, 37, 116}
                )
        );
    }

    @DisplayName("당구 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 당구_연습(int m, int n, int startX, int startY, int[][] balls, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(m, n, startX, startY, balls)).isEqualTo(result);
    }
}