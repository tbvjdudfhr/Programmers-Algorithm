package level2.우박수열정적분;

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
                        5,
                        new int[][]{{0, 0}, {0, -1}, {2, -3}, {3, -3}},
                        new double[]{33.0, 31.5, 0.0, -1.0}
                )
        );
    }

    @DisplayName("원형 수열의 연속 부분 수열 합으로 만들 수 있는 수의 개수")
    @ParameterizedTest
    @MethodSource("args")
    void 연속_부분_수열_합의_개수(int k, int[][] ranges, double[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(k, ranges)).isEqualTo(result);
    }
}
