package inflearn._2_10;

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
                        new int[][]{{0, 0, 0, 0, 0, 0, 0}, {0, 5, 3, 7, 2, 3, 0}, {0, 3, 7, 1, 6, 1, 0}, {0, 7, 2, 5, 3, 4, 0}, {0, 4, 3, 6, 4, 1, 0}, {0, 8, 7, 3, 5, 2, 0}, {0, 0, 0, 0, 0, 0, 0}},
                        10
                )
        );
    }

    @DisplayName("상하좌우 숫자보다 큰 숫자의 갯수를 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 봉우리(int[][] input, int result) {
        assertThat(Solution.soluton(input)).isEqualTo(result);
    }
}
