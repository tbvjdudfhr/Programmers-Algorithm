package level2.요격시스템;

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
                        new int[][]{{4, 5}, {4, 8}, {10, 14}, {11, 14}, {5, 12}, {3, 7}, {1, 4}},
                        3
                )
        );
    }

    @DisplayName("각 폭격 미사일의 x 좌표 범위 목록 targets이 매개변수로 주어질 때, 모든 폭격 미사일을 요격하기 위해 필요한 요격 미사일 수의 최솟값 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 요격_시스템(int[][] targets, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(targets)).isEqualTo(result);
    }
}