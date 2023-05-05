package pccp2._2.신입사원교육;

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
                        new int[]{10, 3, 7, 2},
                        2,
                        37
                ),
                Arguments.of(
                        new int[]{1, 2, 3, 4},
                        3,
                        26
                )
        );
    }

    @DisplayName("신입사원들의 능력치를 나타내는 정수 배열 ability와 민수가 교육을 진행해야 하는 횟수를 나타내는 정수 number가 주어졌을 때, 교육 후 모든 신입사원들의 능력치의 합의 최솟값 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 신입사원_교육(int[] ability, int number, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(ability, number)).isEqualTo(result);
    }
}