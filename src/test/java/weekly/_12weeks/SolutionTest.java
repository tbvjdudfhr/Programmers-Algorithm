package weekly._12weeks;

import custom.CustomParameterizedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {
    Solution sol = new Solution();
    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        80,
                        new int[][]{{80, 20}, {50, 40}, {30, 10}},
                        3
                )
        );
    }

    @CustomParameterizedTest
    @DisplayName("피로도 테스트")
    @MethodSource("args")
    public void solutionTest(int k, int[][] dungeons, int result) {
        assertThat(sol.solution(k, dungeons)).isEqualTo(result);
    }
}