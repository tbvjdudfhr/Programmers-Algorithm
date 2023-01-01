package level2.약수의개수와덧셈;

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
                        13,
                        17,
                        43
                ),
                Arguments.of(
                        24,
                        27,
                        52
                )
        );
    }

    @DisplayName("모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수 테스트")
    @ParameterizedTest
    @MethodSource("args")
    void 약수의_개수와_덧셈(int left, int right, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(left, right)).isEqualTo(result);
    }
}
