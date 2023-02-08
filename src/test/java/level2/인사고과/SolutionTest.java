package level2.인사고과;

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
                        new int[][]{{2, 2}, {1, 4}, {3, 2}, {3, 2}, {2, 1}},
                        4
                )
        );
    }

    @DisplayName("각 사원의 근무 태도 점수와 동료 평가 점수 목록 scores이 주어졌을 때, 완호의 석차 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 인사고과(int[][] scores, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(scores)).isEqualTo(result);
    }
}