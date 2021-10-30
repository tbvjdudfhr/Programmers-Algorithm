package school;

import custom.CustomParameterizedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    Solution sol = new Solution();

    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        4,
                        3,
                        new int[][]{{2, 2}},
                        4
                )
        );
    }

    @DisplayName("등교길")
    @CustomParameterizedTest
    @MethodSource("args")
    void solutionTest(int m, int n, int[][] puddles, int result) {
        assertThat(sol.solution(m, n, puddles)).isEqualTo(result);
    }
}