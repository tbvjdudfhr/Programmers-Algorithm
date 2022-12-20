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

    @DisplayName("우박수의 초항 k와, 정적분을 구하는 구간들의 목록 ranges가 주어졌을 때 정적분의 결과 목록 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 우박수열_정적분(int k, int[][] ranges, double[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(k, ranges)).isEqualTo(result);
    }
}
