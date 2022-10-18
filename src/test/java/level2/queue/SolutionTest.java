package level2.queue;

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
                        new int[]{3, 2, 7, 2},
                        new int[]{4, 6, 5, 1},
                        2
                )
        );
    }

    @DisplayName("각 큐의 원소 합을 같게 만들기 위해 필요한 작업의 최소 횟수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 두_큐_합_같게_만들기(int[] queue1, int[] queue2, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(queue1, queue2)).isEqualTo(result);
    }
}
