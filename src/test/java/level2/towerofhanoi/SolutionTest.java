package level2.towerofhanoi;

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
                        2,
                        new int[][]{{1, 2}, {1, 3}, {2, 3}}
                )
        );
    }

    @DisplayName("1번 기둥에 있는 원판의 개수 n이 매개변수로 주어질 때, n개의 원판을 3번 원판으로 최소로 옮기는 방법 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 하노이의탑(int n, int[][] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(n)).isEqualTo(result);
    }
}
