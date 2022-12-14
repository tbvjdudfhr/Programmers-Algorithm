package level2.sequencesum;

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
                        new int[]{7, 9, 1, 1, 4},
                        18
                )
        );
    }

    @DisplayName("원형 수열의 연속 부분 수열 합으로 만들 수 있는 수의 개수")
    @ParameterizedTest
    @MethodSource("args")
    void 연속_부분_수열_합의_개수(int[] elements, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(elements)).isEqualTo(result);
    }
}
