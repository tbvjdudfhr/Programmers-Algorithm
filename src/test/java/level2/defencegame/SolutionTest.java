package level2.defencegame;

import level2.musketeers.Solution;
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
                        7,
                        3,
                        new int[]{-4, 2, 4, 5, 3, 3, 1},
                        5
                ),
                Arguments.of(
                        2,
                        4,
                        new int[]{3, 3, 3, 3},
                        4
                )
        );
    }

    @DisplayName("몇 라운드까지 막을 수 있는지 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 디펜스_게임(int[] number, int result) {
        level2.musketeers.Solution solution = new Solution();
        assertThat(solution.solution(number)).isEqualTo(result);
    }
}
