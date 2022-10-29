package level2.nighttaticalwalk;

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
                        10,
                        new int[][]{{3, 4}, {5, 8}},
                        new int[][]{{2, 5}, {4, 3}},
                        8
                ),
                Arguments.of(
                        12,
                        new int[][]{{7, 8}, {4, 6}, {11, 10}},
                        new int[][]{{2, 2}, {2, 4}, {3, 3}},
                        12
                )
        );
    }

    @DisplayName("화랑이의 현재 위치와 적군 기지 사이의 거리를 나타내는 정수 distance, 각 경비병의 감시 구간을 담은 2차원 정수 배열 scope, 같은 순서로 각 경비병의 근무 시간과 휴식 시간을 담은 2차원 정수 배열 times가 주어질 때, 화랑이가 경비를 피해 최대로 이동할 수 있는 거리 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 야간_전술보행(int distance, int[][] scope, int[][] times, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(distance, scope, times)).isEqualTo(result);
    }
}
