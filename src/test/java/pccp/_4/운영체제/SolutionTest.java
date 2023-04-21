package pccp._4.운영체제;

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
                        new int[][]{{2, 0, 10}, {1, 5, 5}, {3, 5, 3}, {3, 12, 2}},
                        new long[]{20, 5, 0, 16, 0, 0, 0, 0, 0, 0, 0}
                ),
                Arguments.of(
                        new int[][]{{3, 6, 4}, {4, 2, 5}, {1, 0, 5}, {5, 0, 5}},
                        new long[]{19, 0, 0, 4, 3, 14, 0, 0, 0, 0, 0}
                )
        );
    }

    @DisplayName("프로그램들의 정보를 나타내는 2차원 정수 배열 program이 주어질 때, 모든 프로그램들이 종료되는 시각과 프로그램의 점수마다 대기시간의 합을 정수 배열 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 운영체제(int[][] program, long[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(program)).isEqualTo(result);
    }
}