package level2.musketeers;

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
                        new int[]{-2, 3, 0, 2, -5},
                        2
                ),
                Arguments.of(
                        new int[]{-3, -2, -1, 0, 1, 2, 3},
                        5
                ),
                Arguments.of(
                        new int[]{-1, 1, -1, 1},
                        0
                )
        );
    }

    @DisplayName("학생들 중 삼총사를 만들 수 있는 방법의 수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 삼총사(int[] number, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(number)).isEqualTo(result);
    }
}
