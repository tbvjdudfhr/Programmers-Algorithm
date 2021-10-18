package heap.spicy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    Solution sol = new Solution();

    static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 3, 9, 10, 12},
                        7,
                        2
                )
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    void solutionTest(int[] scoville, int K, int result) {
        assertThat(sol.solution(scoville,K)).isEqualTo(result);
    }
}