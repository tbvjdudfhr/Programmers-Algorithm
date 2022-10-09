package level2.minimum;

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
                        new int[]{1, 4, 2},
                        new int[]{5, 4, 4},
                        29
                )
        );
    }

    @DisplayName("두 수를 곱한 값을 누적하여 더합니다. 이때 최종적으로 누적된 값이 최소값 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 최소값_만들기(int[] A, int[] B, String result) {
        Solution solution = new Solution();
        assertThat(solution.solution(A, B)).isEqualTo(result);
    }
}
