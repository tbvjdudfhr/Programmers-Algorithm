package level2.덧칠하기;

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
                        8,
                        4,
                        new int[]{2, 3, 6},
                        2
                ),
                Arguments.of(
                        5,
                        4,
                        new int[]{1, 3},
                        1
                ),
                Arguments.of(
                        4,
                        1,
                        new int[]{1, 2, 3, 4},
                        4
                )
        );
    }

    @DisplayName("정수 n, m과 다시 페인트를 칠하기로 정한 구역들의 번호가 담긴 정수 배열 section이 매개변수로 주어질 때 롤러로 페인트칠해야 하는 최소 횟수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 덧칠하기(int n, int m, int[] section, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(n, m, section)).isEqualTo(result);
    }
}