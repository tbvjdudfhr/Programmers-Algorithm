package inflearn._2_9;

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
                        new int[][]{{10, 13, 10, 12, 15,}, {12, 39, 30, 23, 11}, {11, 25, 50, 53, 15,}, {19, 27, 29, 37, 27}, {19, 13, 30, 13, 19,}},
                        155
                )
        );
    }

    @DisplayName("각 행의 합, 열의 합, 대각선의 합 중 가장 큰 합을 반환 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 격자판_최대합(int[][] input, int result) {
        assertThat(Solution.soluton(input)).isEqualTo(result);
    }
}
