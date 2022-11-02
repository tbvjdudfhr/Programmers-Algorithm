package level2.lineup;

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
                        3,
                        5,
                        new int[]{3, 1, 2}
                )
        );
    }

    @DisplayName("사람의 수 n과, 자연수 k가 주어질 때, 사람을 나열 하는 방법을 사전 순으로 나열 했을 때, k번째 방법 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 줄_서는_방법(int n, long k, int[] result) {
        Solution solution = new Solution();
        assertThat(solution.solution(n, k)).isEqualTo(result);
    }
}
