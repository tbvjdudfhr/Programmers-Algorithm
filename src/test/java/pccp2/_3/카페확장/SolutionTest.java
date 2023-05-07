package pccp2._3.카페확장;

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
                        new int[]{5, 12, 30},
                        new int[]{1, 2, 0, 1},
                        10,
                        3
                ),
                Arguments.of(
                        new int[]{5, 12, 30},
                        new int[]{2, 1, 0, 0, 0, 1, 0},
                        10,
                        4
                ),
                Arguments.of(
                        new int[]{5},
                        new int[]{0, 0, 0, 0, 0},
                        5,
                        1
                )
        );
    }

    @DisplayName("오늘 카페에 동시에 존재한 손님 수의 최댓값 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 카페_확장(int[] menu, int[] order, int k, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(menu, order, k)).isEqualTo(result);
    }
}