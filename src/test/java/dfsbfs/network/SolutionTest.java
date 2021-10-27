package dfsbfs.network;

import custom.CustomParameterizedTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution sol = new Solution();
    public static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(
                        3,
                        new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}},
                        2
                ),
                Arguments.of(
                        3,
                        new int[][]{{1,1,0},{1,1,1},{0,1,1}},
                        1
                )
        );
    }

    @CustomParameterizedTest
    @DisplayName("네트워크")
    @MethodSource("args")
    public void solutionTest(int n , int[][] computers, int result) {
        assertThat(sol.solution(n, computers)).isEqualTo(result);
    }
}